package ste.sudoku.etape3.version1;

import ste.sudoku.etape3.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape3.sudokuInterface.Ecran;
import ste.sudoku.etape3.sudokuInterface.Sudoku;



public class SudokuFactoryV1 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		return new SudokuV1();
	}

	@Override
	public Ecran createEcran() {
		return new EcranV1();
	}

}
