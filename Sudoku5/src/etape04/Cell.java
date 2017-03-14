package etape04;


import exception.InvalidSudokuValueException;



public interface Cell
{
	public SudokuValue getValue();
	public void setValue(String val) throws InvalidSudokuValueException;
	public void setValue(SudokuValue val) throws InvalidSudokuValueException;
}