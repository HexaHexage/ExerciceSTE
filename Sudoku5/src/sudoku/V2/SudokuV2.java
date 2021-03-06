package sudoku.V2;



import cellules.SudokuValue1_4;
import etape04.SudokuValue;
import Heritage.AbstractSudoku;

public class SudokuV2 extends AbstractSudoku 
{
	
	
	public SudokuV2(int line, int column, SudokuValue[] validValue) 
	{
		super(line, column, validValue);
		// TODO Auto-generated constructor stub
	}

	
		public SudokuV2() 
		{
			super(4,4,SudokuValue1_4.values());
		}
	
}
	/*
	public SudokuV2(int line, int column, byte[] validValue)
	{
		super(line, column, validValue);
		// TODO Auto-generated constructor stub
	}


	private byte[][] grid = new byte[4][4];
	
	private final byte[] tabValid = {1,2,3,4};
	*/
	
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
				&& Arrays.deepEquals(this.grid, ((SudokuV2)o).grid)){
			equals=true;
		}
		
		return equals;
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
	public int getLineSize() {
		return 4;
	}
	*/
	
	/*
	@Override
	public int getColumnSize() {
		return 4;
	}
	*/
	
	/*
	@Override
	public boolean isValidPosition(int line, int column) {
		return line >= 0 && line < getLineSize() && column >= 0
				&& column < getColumnSize();
	}
	*/
	/*
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
	*/
	/*
	@Override
	public byte[] getValidValues() {
		return Arrays.copyOf(tabValid, tabValid.length);
	}
	*/


