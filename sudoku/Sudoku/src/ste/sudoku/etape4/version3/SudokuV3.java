package ste.sudoku.etape4.version3;

import ste.sudoku.etape4.heritage.AbstractSudoku;


public class SudokuV3 extends AbstractSudoku  {
	
	public SudokuV3() {
		super(12, 12, new byte[] { 1, 2, 3, 4 });
	}

	@Override
	public boolean isValidPosition(int line, int column) {
		boolean isValid = super.isValidPosition(line, column); 
		if(isValid){
			int leftLimite = getValidValues().length ;
			int rightLimite = getLineSize()-leftLimite;
			isValid = !( (line<leftLimite||line>=rightLimite)  && (column<leftLimite||column>=rightLimite) );
		}
		return isValid;		
				
	}
}
