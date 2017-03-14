package ste.sudoku.etape5.version3;

import ste.sudoku.etape5.cellules.SudokuValue1_4;
import ste.sudoku.etape5.heritage.AbstractSudoku;


public class SudokuV3 extends AbstractSudoku  {
	
	public SudokuV3() {
		super(12,12,SudokuValue1_4.values());
	}

	@Override
	public boolean isValidPosition(int line, int column) {
		boolean isValid = super.isValidPosition(line, column); 
		if(isValid){
			int leftLimite = getValidValue().length ;
			int rightLimite = getLineSize()-leftLimite;
			isValid = !( (line<leftLimite||line>=rightLimite)  && (column<leftLimite||column>=rightLimite) );
		}
		return isValid;		
				
	}
}
