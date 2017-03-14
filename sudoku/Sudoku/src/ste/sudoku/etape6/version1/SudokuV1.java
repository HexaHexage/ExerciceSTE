package ste.sudoku.etape6.version1;

import java.util.HashSet;
import java.util.Set;

import ste.sudoku.etape6.cellules.SudokuValue1_9;
import ste.sudoku.etape6.exceptions.OutOfSudokuException;
import ste.sudoku.etape6.heritage.AbstractSudoku;
import ste.sudoku.etape6.sudokuInterface.Cell;



public class SudokuV1 extends AbstractSudoku  {
	

	public SudokuV1() {
		super(9,9,SudokuValue1_9.values());
	}

	@Override
	public Set<Cell> getRegion(int nbr) throws OutOfSudokuException {
		if(!mapRegion.containsKey(nbr)){
			int col = (nbr%3)*3;
			int ligne  = (nbr/3)*3;
			Set<Cell> cells = new HashSet<Cell>();
			for (int l = ligne; l < ligne+3; l++) {
				for (int c = col; c < col+3; c++) {
					cells.add(getCell(l,c));
				}
			}
		}
//		 return super.getRegion(nbr, 3,3);
		return mapRegion.get(nbr);

	}
}
