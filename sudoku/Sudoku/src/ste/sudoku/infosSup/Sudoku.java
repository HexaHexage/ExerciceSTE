package ste.sudoku.infosSup;

public interface Sudoku {

	SudokuValue getValue(SudokuPosition pos);
	
	void setValue(SudokuValue val, SudokuPosition pos);
	
	boolean isEmpty(SudokuPosition pos);
	
	boolean isDone();
	
	SudokuValue[][] getValues();
	
	void setReady();
	
	boolean isReady();
}
