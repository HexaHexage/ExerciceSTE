package ste.sudoku.etape3.version3;

import ste.sudoku.etape3.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape3.sudokuInterface.Ecran;
import ste.sudoku.etape3.sudokuInterface.Sudoku;


public class SudokuFactoryV3 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		return new SudokuV3();
	}

	@Override
	public Ecran createEcran() {
		return new EcranV3();
	}

}
