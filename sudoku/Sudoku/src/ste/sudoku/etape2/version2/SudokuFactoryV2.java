package ste.sudoku.etape2.version2;

import ste.sudoku.etape2.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape2.sudokuInterface.Ecran;
import ste.sudoku.etape2.sudokuInterface.Sudoku;
import ste.sudoku.etape2.version2.EcranV2;

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
