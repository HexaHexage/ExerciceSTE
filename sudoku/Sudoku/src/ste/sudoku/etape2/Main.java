
package ste.sudoku.etape2;

import ste.sudoku.etape2.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape2.sudokuInterface.Ecran;
import ste.sudoku.etape2.sudokuInterface.Sudoku;

public class Main {
	


	public static void main(String[] args) {
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION1);
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION2);
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION3);
		System.out.println("==============================");
		scenario(AbstractSudokuFactory.VERSION4);
		System.out.println("==============================");
		
	}
	
	public static void scenario(int type) {
		System.out.println("Scénario "+type);
		
		AbstractSudokuFactory factory = AbstractSudokuFactory.getFactory(type);

		Sudoku sudo = factory.createSudoku();
		Ecran ecran = factory.createEcran();
		sudo.setValue((byte) 1, 0, 0);
		sudo.setValue((byte) 2, 1, 1);
		sudo.setValue((byte) 3, 2, 2);
		sudo.setValue((byte) 4, 3, 3);
		sudo.setValue((byte) 5, 1, 3);
		sudo.setValue((byte) 6, 2, 3);

		ecran.afficheTitre();
		ecran.afficheSudoku(sudo);
	}

}
