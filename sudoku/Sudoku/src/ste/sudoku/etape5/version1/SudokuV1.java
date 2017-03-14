package ste.sudoku.etape5.version1;

import ste.sudoku.etape5.cellules.SudokuValue1_9;
import ste.sudoku.etape5.heritage.AbstractSudoku;



public class SudokuV1 extends AbstractSudoku  {
	

	public SudokuV1() {
		super(9,9,SudokuValue1_9.values());
	}


}
