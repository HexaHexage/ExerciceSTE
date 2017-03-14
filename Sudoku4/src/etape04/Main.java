package etape04;

import exception.InvalidSudokuValueException;
import exception.OutOfSudokuException;


public class Main 
{
	
	
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
	public static void scenario(int type) {
		
		System.out.println("Main.scenario()");
		AbstractSudokuFactory factory = AbstractSudokuFactory.getFactory(type);

		Sudoku sudo = factory.createSudoku();
		Ecran ecran = factory.createEcran();
		byte[][] action = new byte[][] { { 1, 0, 4 }, { 2, 1, 1 }, { 3, 2, 2 },
				{ 4, 3, 3 }, { 5, 1, 3 }, { 6, 2, 5 }, };

		for (byte[] act : action) {
			try {
				System.out.print(String.format("ajout de %s en %s, %s : ", act[0], act[1], act[2]));
				sudo.setValue(act[0], act[1], act[2]);
				System.out.println("OK");
			} catch (OutOfSudokuException e) {
				System.out.println("position refusée");
			} catch (InvalidSudokuValueException e) {
				System.out.println("valeur refusée");
			}
		}

		ecran.afficheTitre();
		ecran.afficheSudoku(sudo);
	}
}
