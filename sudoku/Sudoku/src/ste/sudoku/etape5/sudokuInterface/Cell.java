package ste.sudoku.etape5.sudokuInterface;

import ste.sudoku.etape5.exceptions.InvalidSudokuValueException;



public interface Cell {
	public SudokuValue getValue();
	public void setValue(String val) throws InvalidSudokuValueException;
	public void setValue(SudokuValue val) throws InvalidSudokuValueException;
}
