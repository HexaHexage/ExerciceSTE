package ste.sudoku.etape6.sudokuInterface;

import ste.sudoku.etape6.sudokuInterface.SudokuValue;
import ste.sudoku.etape6.exceptions.DoublonSudokuException;
import ste.sudoku.etape6.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape6.exceptions.LockedCellException;



public interface Cell {
	public SudokuValue getValue();
	public void setValue(String val) throws InvalidSudokuValueException, DoublonSudokuException,  LockedCellException;
	public void setValue(SudokuValue val) throws InvalidSudokuValueException, DoublonSudokuException,  LockedCellException;
	public void addZone(Zone z);
	public void setLocked();
}
