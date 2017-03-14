package ste.sudoku.etape3.version2;

import ste.sudoku.etape3.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape3.sudokuInterface.Ecran;
import ste.sudoku.etape3.sudokuInterface.Sudoku;
;

public class SudokuFactoryV2 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		return new SudokuV2();
	}

	@Override
	public Ecran createEcran() {
		return new EcranV2();
	}

}
