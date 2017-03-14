package ste.sudoku.etape2.version1;

import ste.sudoku.etape2.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape2.sudokuInterface.Ecran;
import ste.sudoku.etape2.sudokuInterface.Sudoku;

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
