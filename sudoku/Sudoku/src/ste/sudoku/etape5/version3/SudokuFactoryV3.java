package ste.sudoku.etape5.version3;

import ste.sudoku.etape5.cellules.Cell1_4;
import ste.sudoku.etape5.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape5.sudokuInterface.Ecran;
import ste.sudoku.etape5.sudokuInterface.Sudoku;


public class SudokuFactoryV3 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		SudokuV3 sudo = new SudokuV3();
		Cell1_4[][] grid = new Cell1_4[sudo.getLineSize()][sudo.getColumnSize()];
		sudo.setGrid(grid);
		for (int i = 0; i < sudo.getLineSize(); i++) {
			for (int j = 0; j < sudo.getColumnSize(); j++) {
				if(sudo.isValidPosition(i,j)){
					grid[i][j]=new Cell1_4();
				}
			}
		}
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV3();
	}

}
