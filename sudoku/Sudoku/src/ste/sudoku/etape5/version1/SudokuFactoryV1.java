package ste.sudoku.etape5.version1;

import ste.sudoku.etape5.cellules.Cell1_9;
import ste.sudoku.etape5.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape5.sudokuInterface.Ecran;
import ste.sudoku.etape5.sudokuInterface.Sudoku;



public class SudokuFactoryV1 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		SudokuV1 sudo = new SudokuV1();
		Cell1_9[][] grid = new Cell1_9[sudo.getLineSize()][sudo.getColumnSize()];
		sudo.setGrid(grid);
		for (int i = 0; i < sudo.getLineSize(); i++) {
			for (int j = 0; j < sudo.getColumnSize(); j++) {
				if(sudo.isValidPosition(i,j)){
					grid[i][j]=new Cell1_9();
				}
			}
		}		
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV1();
	}

}
