package ste.sudoku.etape2.version4;

import ste.sudoku.etape2.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape2.sudokuInterface.Ecran;
import ste.sudoku.etape2.sudokuInterface.Sudoku;

public class SudokuFactoryV4 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		return new SudokuV4();
	}

	@Override
	public Ecran createEcran() {
		return new EcranV4();
	}

}
