package ste.sudoku.etape4.version2;

import ste.sudoku.etape4.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape4.sudokuInterface.Ecran;
import ste.sudoku.etape4.sudokuInterface.Sudoku;
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
