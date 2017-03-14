package ste.sudoku.etape5Bis.version2;

import ste.sudoku.etape5Bis.cellules.Cell1_4;
import ste.sudoku.etape5Bis.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape5Bis.sudokuInterface.Ecran;
import ste.sudoku.etape5Bis.sudokuInterface.Sudoku;
;

public class SudokuFactoryV2 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		SudokuV2 sudo = new SudokuV2();
		fillGrid(Cell1_4.class, sudo);	
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV2();
	}

}
