package ste.sudoku.etape5Bis.version3;

import ste.sudoku.etape5Bis.cellules.Cell1_9;
import ste.sudoku.etape5Bis.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape5Bis.sudokuInterface.Ecran;
import ste.sudoku.etape5Bis.sudokuInterface.Sudoku;

public class SudokuFactoryV3 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		SudokuV3 sudo = new SudokuV3();
		fillGrid(Cell1_9.class, sudo);
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV3();
	}

}
