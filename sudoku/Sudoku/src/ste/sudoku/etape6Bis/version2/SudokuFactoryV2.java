package ste.sudoku.etape6Bis.version2;

import ste.sudoku.etape6Bis.cellules.Cell1_4;
import ste.sudoku.etape6Bis.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape6Bis.sudokuInterface.Ecran;
import ste.sudoku.etape6Bis.sudokuInterface.Sudoku;
;

public class SudokuFactoryV2 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		
		SudokuV2 sudo = new SudokuV2();
		createGrid(Cell1_4.class, sudo);	
		createZone(sudo);
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV2();
	}

}
