package ste.sudoku.etape2.version2;

import java.util.Arrays;

import ste.sudoku.etape2.sudokuInterface.Sudoku;
import ste.sudoku.etape2.version1.SudokuV1;

public class SudokuV2 implements Sudoku  {
	
	private byte[][] grid = new byte[4][4];
	
	
	@Override
	public void setValue(byte i, int line, int column) {
		this.grid[line][column] = i;
	}

	
	@Override
	public byte getValue(int line, int column) {
		return this.grid[line][column];
	}

	@Override
	public boolean equals(Object o){
		if(o==null || o.getClass()!=this.getClass())return false;
		return Arrays.deepEquals(this.grid, ((SudokuV2)o).grid);
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
