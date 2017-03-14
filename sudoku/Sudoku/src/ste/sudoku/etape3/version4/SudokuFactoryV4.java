package ste.sudoku.etape3.version4;

import ste.sudoku.etape3.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape3.sudokuInterface.Ecran;
import ste.sudoku.etape3.sudokuInterface.Sudoku;

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
