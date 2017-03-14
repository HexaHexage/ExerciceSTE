package ste.sudoku.etape6.version4;

import java.util.Set;

import ste.sudoku.etape6.cellules.SudokuValue1_9;
import ste.sudoku.etape6.exceptions.OutOfSudokuException;
import ste.sudoku.etape6.heritage.AbstractSudoku;
import ste.sudoku.etape6.sudokuInterface.Cell;





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

	@Override
	public Set<Cell> getRegion(int nbr) throws OutOfSudokuException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
