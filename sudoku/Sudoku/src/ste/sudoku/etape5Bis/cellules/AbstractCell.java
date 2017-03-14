package ste.sudoku.etape5Bis.cellules;

import ste.sudoku.etape5Bis.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape5Bis.sudokuInterface.Cell;
import ste.sudoku.etape5Bis.sudokuInterface.SudokuValue;

public abstract class  AbstractCell implements Cell{
	
	private Class<? extends Enum> enumClass;
	private SudokuValue val;
	
	public AbstractCell(Class<? extends Enum> enumClass){
		this.enumClass=enumClass;
	}
	
	@Override
	public SudokuValue getValue() {
		return this.val;
	}

	@Override
	public void setValue(String val) throws InvalidSudokuValueException {
		
		try{
			setValue( (SudokuValue)Enum.valueOf(enumClass, "VAL_"+val));
		}catch(IllegalArgumentException e){
			throw new  InvalidSudokuValueException(String.format(
					"Valeur non valid : %s", val),e);
		}
		
	}

	@Override
	public void setValue(SudokuValue val) throws InvalidSudokuValueException {
		if(!(val.getClass()==enumClass))throw new InvalidSudokuValueException(String.format(
				"Valeur non valid : %s", val));
		this.val=val;
		
	}
	
}
