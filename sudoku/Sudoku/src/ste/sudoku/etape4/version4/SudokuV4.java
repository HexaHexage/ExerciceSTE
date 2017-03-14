package ste.sudoku.etape4.version4;

import java.util.Arrays;

import ste.sudoku.etape3.sudokuInterface.Sudoku;
import ste.sudoku.etape4.heritage.AbstractSudoku;



public class SudokuV4 extends  AbstractSudoku {
	
	public SudokuV4() {
		super(21, 21, new byte[] { 1, 2, 3, 4,5,6,7,8,9 });
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
