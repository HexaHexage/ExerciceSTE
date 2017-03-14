package ste.sudoku.etape2.version3;

import java.util.Arrays;

import ste.sudoku.etape2.sudokuInterface.Sudoku;

public class SudokuV3 implements Sudoku  {
	

	private byte[][] grid = new byte[12][12];	

	@Override
	public void setValue(byte val, int line, int column) {
		if (isValidPosition(line, column)) {
			grid[line][column] = val;
		}

	}

	@Override
	public byte getValue(int line, int column) {
		if (isValidPosition(line, column)) {
			return grid[line][column];
		} else {
			return -1;
		}
	}

	private boolean isValidPosition(int line, int column) {
		return !( (line<4||line>7)  && (column<4||column>7) );
	}

	@Override
	public boolean equals(Object o){
		
		boolean equals = this==o;
		
		if(!equals && o!=null && o.getClass()==this.getClass() 
				&& Arrays.deepEquals(this.grid, ((SudokuV3)o).grid)){
			equals=true;
		}
		
		return equals;
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
