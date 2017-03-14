package etape04;

import exception.InvalidSudokuValueException;
import exception.OutOfSudokuException;
import java.util.InputMismatchException;
import java.util.Scanner;
import etape04.AbstractSudokuFactory;
import etape04.Ecran;
import etape04.Sudoku;

public class Main 
{
	
	private static final Scanner sc = new Scanner(System.in);

	 // Méthode de lancement de l'application Sudoku. 
	 //Teste l'affichage du sudoku et les methodes equals, hashCode et toString
	 //
	 //@param args
	 
	public static void main(String[] args) 
	{
		

		
			System.out.println("==============================");
			scenario(AbstractSudokuFactory.VERSION1);
			System.out.println("==============================");
			scenario(AbstractSudokuFactory.VERSION2);
			System.out.println("==============================");
			scenario(AbstractSudokuFactory.VERSION3);
			System.out.println("==============================");
			
	}

	/**
	 * 
	 */
	public static void scenario(int type) 
	{
			System.out.println("Main.scenario()");
			AbstractSudokuFactory factory = AbstractSudokuFactory.getFactory(type);

			Sudoku sudo = factory.createSudoku();
			Ecran ecran = factory.createEcran();
			ecran.afficheTitre();
			//boolean jouer = true;
			int l, c;
			String val = null;
			try {
				do {
					System.out.println("Entrez  la ligne(0/8) et la colonne(0/8) et la valeur  (q pour quitter)");
					l = sc.nextInt();
					c = sc.nextInt();
					sc.nextLine();
					val = sc.nextLine();

					try 
					{

						System.out.println(String.format("ajout de %s en %d, %d : ", val, l, c));
						sudo.getCell(l, c).setValue(val);
						ecran.afficheSudoku(sudo);
					//	sudo.getCell(l, c).setValue(null); ambiguité

					} 
					catch (OutOfSudokuException e)
					{
						System.out.println("position refusée");
					} 
					catch (InvalidSudokuValueException e)
					{
						System.out.println("valeur refusée");
					}

				} 
				while (!"q".equals(val));

			} 
			catch (InputMismatchException e) 
			{
				sc.nextLine();
			}

		}
}
