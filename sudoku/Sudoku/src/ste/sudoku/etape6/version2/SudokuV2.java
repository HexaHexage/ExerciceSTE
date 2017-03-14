package ste.sudoku.etape6.version2;

import java.util.HashSet;
import java.util.Set;

import ste.sudoku.etape6.cellules.SudokuValue1_4;
import ste.sudoku.etape6.exceptions.OutOfSudokuException;
import ste.sudoku.etape6.heritage.AbstractSudoku;
import ste.sudoku.etape6.sudokuInterface.Cell;



public class SudokuV2 extends AbstractSudoku  {
	
	public SudokuV2() {
		super( 4,4,SudokuValue1_4.values());
	}
	
	@Override
	public Set<Cell> getRegion(int nbr) throws OutOfSudokuException {
		if(!mapRegion.containsKey(nbr)){
			int col = (nbr%2)*2;
			int ligne  = (nbr/2)*2;
			Set<Cell> cells = new HashSet<Cell>();
			for (int l = ligne; l < ligne+2; l++) {
				for (int c = col; c < col+2; c++) {
					cells.add(getCell(l,c));
				}
			}
			mapRegion.put(nbr,cells);
		}
//		 return super.getRegion(nbr, 2,2);
		return mapRegion.get(nbr);

	}
}
