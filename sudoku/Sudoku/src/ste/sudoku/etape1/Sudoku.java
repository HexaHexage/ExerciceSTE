package ste.sudoku.etape1;

import java.util.Arrays;

public class Sudoku {
	
	private byte[][] grid = new byte[9][9];
	
	
	public void setValue(byte i, int line, int column) {
		this.grid[line][column] = i;
	}
	
	/**
	 * La méthode renvoit la valeur d'une case
	 * @param line 		numéro de la ligne dans le sudoku
	 * @param column	numéro de la colonne dans le sudoku
	 * @return la valeur dans la case line column 
	 */
	public byte getValue(int line, int column) {
		return this.grid[line][column];
	}

	@Override
	public boolean equals(Object o){
		
		boolean equals = this==o;
		
		if(!equals && o!=null && o.getClass()==this.getClass() 
				&& Arrays.deepEquals(this.grid, ((Sudoku)o).grid)){
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
