package ste.sudoku.etape6.version3;

import java.util.HashSet;
import java.util.Set;

import ste.sudoku.etape6.cellules.SudokuValue1_4;
import ste.sudoku.etape6.exceptions.OutOfSudokuException;
import ste.sudoku.etape6.heritage.AbstractSudoku;
import ste.sudoku.etape6.sudokuInterface.Cell;


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
	
	@Override
	public Set<Cell> getRegion(int nbr) throws OutOfSudokuException {
		if(!mapRegion.containsKey(nbr)){
			int col = (nbr%6)*2;
			int ligne  = (nbr/6)*2;
			Set<Cell> cells = new HashSet<Cell>();
			for (int l = ligne; l < ligne+2; l++) {
				for (int c = col; c < col+2; c++) {
					cells.add(getCell(l,c));
				}
			}
			mapRegion.put(nbr,cells);
		}
		return mapRegion.get(nbr);
//		 return super.getRegion(nbr, 6,2);
	}
}
