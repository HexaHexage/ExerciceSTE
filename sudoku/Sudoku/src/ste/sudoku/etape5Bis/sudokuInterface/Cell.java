package ste.sudoku.etape5Bis.sudokuInterface;

import ste.sudoku.etape5Bis.exceptions.InvalidSudokuValueException;



public interface Cell {
	public SudokuValue getValue();
	public void setValue(String val) throws InvalidSudokuValueException;
	public void setValue(SudokuValue val) throws InvalidSudokuValueException;
}
