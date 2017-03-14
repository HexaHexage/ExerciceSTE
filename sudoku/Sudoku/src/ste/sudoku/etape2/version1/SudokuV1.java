package ste.sudoku.etape2.version1;

import java.util.Arrays;

import ste.sudoku.etape2.sudokuInterface.Sudoku;

public class SudokuV1 implements Sudoku  {
	
	private byte[][] grid = new byte[9][9];
	

	/* (non-Javadoc)
	 * @see ste.sudoku.etape2.Sudoku#setValue(byte, int, int)
	 */
	@Override
	public void setValue(byte i, int line, int column) {
		this.grid[line][column] = i;
	}

	


	/* (non-Javadoc)
	 * @see ste.sudoku.etape2.Sudoku#getValue(int, int)
	 */
	@Override
	public byte getValue(int line, int column) {
		return this.grid[line][column];
	}

	@Override
	public boolean equals(Object o){
		if(o==this)return true;
		if(o==null || o.getClass()!=this.getClass())return false;
		return Arrays.deepEquals(this.grid, ((SudokuV1)o).grid);
	}
	
	@Override
	public int hashCode(){
		return Arrays.deepHashCode(grid);
		
	}
	
	@Override 
	public String toString(){
		return "Sudoku : grid = "+Arrays.deepToString(grid);
	}





}
