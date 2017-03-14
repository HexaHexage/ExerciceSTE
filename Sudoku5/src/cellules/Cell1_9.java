package cellules;


import exception.InvalidSudokuValueException;
import etape04.Cell;

import etape04.SudokuValue;


public class Cell1_9 implements Cell
{
	
	SudokuValue1_9 val;

	@Override
	public SudokuValue getValue()
	{
		
		return this.val;
	}
	
	@Override
	public void setValue(SudokuValue val) throws InvalidSudokuValueException
	{
		if(!(val instanceof SudokuValue1_9))throw new InvalidSudokuValueException(String.format("Valeur n'est pas valide : %s", val));
		this.val=(SudokuValue1_9) val;
	}
	
	@Override
	public void setValue(String val) throws InvalidSudokuValueException
	{
		
		try
		{
			setValue(SudokuValue1_9.valueOf("VAL_"+val));
		}
		catch(IllegalArgumentException e)
		{
			throw new  InvalidSudokuValueException(String.format("Valeur n'est pas valide : %s", val),e);
		}
			 
	}
}
