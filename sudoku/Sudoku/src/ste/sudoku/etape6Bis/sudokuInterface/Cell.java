package ste.sudoku.etape6Bis.sudokuInterface;

import ste.sudoku.etape6Bis.sudokuInterface.SudokuValue;
import ste.sudoku.etape6Bis.exceptions.DoublonSudokuException;
import ste.sudoku.etape6Bis.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape6Bis.exceptions.LockedCellException;



public interface Cell {
	public SudokuValue getValue();
	public void setValue(String val) throws InvalidSudokuValueException, DoublonSudokuException,  LockedCellException;
	public void setValue(SudokuValue val) throws InvalidSudokuValueException, DoublonSudokuException,  LockedCellException;
	public void addZone(Zone z);
	public void setLocked();
}
