package sudoku.V3;

import etape04.AbstractSudokuFactory;
import etape04.Ecran;
import etape04.Sudoku;
import cellules.Cell1_9;

public class SudokuFactoryV3 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		SudokuV3 sudo = new SudokuV3();
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
		return new EcranV3();
	}

}