package ste.sudoku.etape5.version2;

import ste.sudoku.etape5.cellules.SudokuValue1_4;
import ste.sudoku.etape5.heritage.AbstractSudoku;



public class SudokuV2 extends AbstractSudoku  {
	
	public SudokuV2() {
		super(4,4,SudokuValue1_4.values());
	}
}
