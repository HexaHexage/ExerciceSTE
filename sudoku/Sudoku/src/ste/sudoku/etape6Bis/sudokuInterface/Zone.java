package ste.sudoku.etape6Bis.sudokuInterface;

import java.util.Set;

import ste.sudoku.etape6Bis.sudokuInterface.SudokuValue;

public interface Zone {

	public Set<SudokuValue> getSudokuSet();
	public boolean contains(SudokuValue val) ;
	public boolean add(SudokuValue val) ;
	public boolean remove(SudokuValue val);
	
}
