package ste.sudoku.etape2.version4;

import java.util.Arrays;

import ste.sudoku.etape2.sudokuInterface.Sudoku;

public class SudokuV4 implements Sudoku {
	
	private byte[][] grid = new byte[21][21];	

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
		boolean isValid = true;
		if(column>8 && column<12){
			isValid = !(line<6 || line>14);
		}else if(line>8 && line<12){
			isValid = !(column<6 || column>14);
		}
		
		return isValid;
	}

	@Override
	public boolean equals(Object o){
		
		boolean equals = this==o;
		
		if(!equals && o!=null && o.getClass()==this.getClass() 
				&& Arrays.deepEquals(this.grid, ((SudokuV4)o).grid)){
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
