package ste.sudoku.etape5Bis.version2;

import ste.sudoku.etape5Bis.cellules.SudokuValue1_4;
import ste.sudoku.etape5Bis.heritage.AbstractSudoku;



public class SudokuV2 extends AbstractSudoku  {
	
	public SudokuV2() {
		super(4,4,SudokuValue1_4.values());
	}
}
