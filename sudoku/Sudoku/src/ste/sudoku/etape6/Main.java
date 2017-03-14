package ste.sudoku.etape6;

import java.util.InputMismatchException;
import java.util.Scanner;

import ste.sudoku.etape6.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape6.exceptions.OutOfSudokuException;
import ste.sudoku.etape6.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape6.sudokuInterface.Ecran;
import ste.sudoku.etape6.sudokuInterface.Sudoku;
import ste.sudoku.etape6.exceptions.DoublonSudokuException;
import ste.sudoku.etape6.exceptions.LockedCellException;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION1);
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION2);
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION3);
		System.out.println("==============================");
	}

	public static void scenario(int type) {
		System.out.println("Main.scenario()");
		AbstractSudokuFactory factory = AbstractSudokuFactory.getFactory(type);

		Sudoku sudo = factory.createSudoku();
		Ecran ecran = factory.createEcran();
		ecran.afficheTitre();
		ecran.afficheSudoku(sudo);
		boolean jouer = true;
		int l, c;
		String val = null;
		try {
			do {
				System.out.println("Entrez  la ligne et la colonne et la valeur /N (q pour quitter)");
				l = sc.nextInt();
				c = sc.nextInt();
				sc.nextLine();
				val = sc.nextLine();

				try {

					System.out.println(String.format("ajout de %s en %d, %d : ", val, l, c));
					sudo.getCell(l, c).setValue(val);
					ecran.afficheSudoku(sudo);

				} catch (OutOfSudokuException e) {
					System.out.println("position refusée");
				} catch (InvalidSudokuValueException e) {
					System.out.println("valeur refusée");
				} catch (DoublonSudokuException e) {
					System.out.println("valeur en doublon");
				}catch (LockedCellException e) {
					System.out.println("valeur bloquée");
				}

			} while (!"q".equals(val));

		} catch (InputMismatchException e) {
			sc.nextLine();
		}

	}
}
