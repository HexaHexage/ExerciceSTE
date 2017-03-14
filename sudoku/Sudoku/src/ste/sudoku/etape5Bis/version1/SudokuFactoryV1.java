package ste.sudoku.etape5Bis.version1;

import ste.sudoku.etape5Bis.cellules.Cell1_9;
import ste.sudoku.etape5Bis.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape5Bis.sudokuInterface.Ecran;
import ste.sudoku.etape5Bis.sudokuInterface.Sudoku;



public class SudokuFactoryV1 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		
		SudokuV1 sudo = new SudokuV1();
		fillGrid(Cell1_9.class, sudo);
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV1();
	}

}
