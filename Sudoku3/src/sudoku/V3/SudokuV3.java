package sudoku.V3;

import java.util.Arrays;

import etape03.Sudoku;
import exception.InvalidSudokuValueException;
import exception.OutOfSudokuException;

public class SudokuV3 implements Sudoku 
{
	
	private byte[][] grid = new byte[21][21];
	private byte[] tabValid = {1,2,3,4,5,6,7,8,9};
	
	
	/* (non-Javadoc)
	 * @see etape01.Sudoku#setValue(byte, int, int)
	 */
	@Override
	public void setValue(byte val, int line, int column)
			throws OutOfSudokuException, InvalidSudokuValueException
	{
		if (isValidPosition(line, column)) 
		{
			if (!isValidValue(val))
			{
				throw new InvalidSudokuValueException(String.format(
						"Valeur non valid : %s", val));
			}
			grid[line][column] = val;
		} else 
		{
			throw new OutOfSudokuException(String.format(
					"Pas de cellule en position ligne = %s colonne = %s", line, column));
		}
	}

	
	
	 // La méthode renvoit la valeur d'une case
	 // @param line 		numéro de la ligne dans le sudoku
	 // @param column	numéro de la colonne dans le sudoku
	 // @return la valeur dans la case line column 
	
	/* (non-Javadoc)
	 * @see etape01.Sudoku#getValue(int, int)
	 */
	@Override
	public byte getValue(int line, int column) throws OutOfSudokuException 
	{
		if (isValidPosition(line, column))
		{
			return grid[line][column];
		} else 
		{
			throw new OutOfSudokuException(String.format(
					"Pas de cellule en position ligne = %s colonne = %s", line, column));
		}
	}
	
	@Override
	public boolean equals(Object o)
	{
		
		boolean equals = this==o;
		
		if(!equals && o!=null && o.getClass()==this.getClass() 
				&& Arrays.deepEquals(this.grid, ((SudokuV3)o).grid)){
			equals=true;
		}
		
		return equals;
	}
	
	@Override
	public int hashCode()
	{
		
		return Arrays.deepHashCode(grid);
		
	}
	
	@Override 
	public String toString()
	{
		return "Sudoku : grid = "+Arrays.deepToString(grid);
	}
	
	@Override
	public int getLineSize() {
		return 21;
	}

	@Override
	public int getColumnSize() {
		return 21;
	}

	

	@Override
	public boolean isValidValue(byte val) {
		boolean valid = false;
		int pos = 0;
		while (pos < tabValid.length && !valid) {
			valid = val == tabValid[pos];
			pos++;
		}
		return valid;
	}

	@Override
	public byte[] getValidValues() {
		return Arrays.copyOf(tabValid, tabValid.length);
	}


	@Override
	public boolean isValidPosition(int line, int column) {
		boolean isValid = line >= 0 && line < getLineSize() && column >= 0
				&& column < getColumnSize(); ;
		if(column>8 && column<12){
			isValid = !(line<6 || line>14);
		}else if(line>8 && line<12){
			isValid = !(column<6 || column>14);
		}
		
		return isValid;
	}

}
