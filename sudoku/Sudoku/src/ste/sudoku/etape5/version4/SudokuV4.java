package ste.sudoku.etape5.version4;

import java.util.Arrays;

import ste.sudoku.etape5.cellules.SudokuValue1_9;
import ste.sudoku.etape5.heritage.AbstractSudoku;





public class SudokuV4 extends  AbstractSudoku {
	
	public SudokuV4() {
		super(21, 21, SudokuValue1_9.values());
		// TODO Auto-generated constructor stub
	}

	public boolean isValidPosition(int line, int column) {
		boolean isValid = super.isValidPosition(line, column); 
		if(column>8 && column<12){
			isValid = !(line<6 || line>14);
		}else if(line>8 && line<12){
			isValid = !(column<6 || column>14);
		}
		
		return isValid;
	}

	
	
}
