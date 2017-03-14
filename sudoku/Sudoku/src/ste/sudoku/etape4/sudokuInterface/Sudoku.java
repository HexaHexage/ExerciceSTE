package ste.sudoku.etape4.sudokuInterface;

import ste.sudoku.etape4.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape4.exceptions.OutOfSudokuException;

public interface Sudoku {

	public void setValue(byte i, int line, int column) throws OutOfSudokuException, InvalidSudokuValueException;

	public byte getValue(int line, int column) throws OutOfSudokuException;
	
	public int getLineSize();

	public int getColumnSize();

	public boolean isValidPosition(int line, int column);

	public boolean isValidValue(byte val);
	
	public byte[] getValidValues();
	

}