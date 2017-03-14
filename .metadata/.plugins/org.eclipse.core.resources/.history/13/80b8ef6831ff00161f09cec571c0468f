package sudoku.V1;

import java.util.Arrays;

import Heritage.AbstractSudoku;
import etape04.Sudoku;
import exception.InvalidSudokuValueException;
import exception.OutOfSudokuException;

public class SudokuV1 extends AbstractSudoku  
{
	
	public SudokuV1(int line, int column, byte[] validValue)
	{
		super(line, column, validValue);
		// TODO Auto-generated constructor stub
	}



	private byte[][] grid = new byte[9][9];
	private byte[] tabValid = new byte[]{1,2,3,4,5,6,7,8,9};
	
	/*Les fonctions sont redefinies dans l heritage donc mise en comentaire ici */
	/*------------------------------------------------------------------------*/
	
	/* (non-Javadoc)
	 * @see etape01.Sudoku#setValue(byte, int, int)
	 */
	
	/*
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
	*/
	
	
	 // La méthode renvoit la valeur d'une case
	 // @param line 		numéro de la ligne dans le sudoku
	 // @param column	numéro de la colonne dans le sudoku
	 // @return la valeur dans la case line column 
	
	/* (non-Javadoc)
	 * @see etape01.Sudoku#getValue(int, int)
	 */
	/*
	@Override
	public int getLineSize() 
	{
		return 9;
	}
	
	 */

	/*
	@Override
	public int getColumnSize() 
	{
		return 9;
	}
	*/
	
	/*
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
	*/

	/*
	@Override
	public boolean equals(Object o)
	{
		
		boolean equals = this==o;
		
		if(!equals && o!=null && o.getClass()==this.getClass() 
				&& Arrays.deepEquals(this.grid, ((SudokuV1)o).grid)){
			equals=true;
		}
		
		return equals;
	}
	*/
	/*
	@Override
	public boolean isValidPosition(int line, int column)
	{
		return line >= 0 && line < getLineSize() && column >= 0
				&& column < getColumnSize();
	}
	*/
	
	/*
	@Override
	public boolean isValidValue(byte val)
	{
		boolean valid = false;
		int pos = 0;
		
		while (pos < tabValid .length && !valid)
		{
			valid = val == tabValid[pos];
			pos++;
		}
		return valid;
	}
	
	*/
	
	/*
	@Override
	public int hashCode()
	{
		
		return Arrays.deepHashCode(grid);
		
	}
	*/
	
	/*
	@Override 
	public String toString()
	{
		return "Sudoku : grid = "+Arrays.deepToString(grid);
	}
	*/

	/*
	@Override
	public byte[] getValidValues() 
	{
		// TODO Auto-generated method stub
		return tabValid;
	}
	*/
}
