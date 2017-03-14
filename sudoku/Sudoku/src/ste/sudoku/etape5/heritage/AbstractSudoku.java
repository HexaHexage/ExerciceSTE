package ste.sudoku.etape5.heritage;

import java.util.Arrays;

import ste.sudoku.etape5.exceptions.OutOfSudokuException;
import ste.sudoku.etape5.sudokuInterface.Cell;
import ste.sudoku.etape5.sudokuInterface.Sudoku;
import ste.sudoku.etape5.sudokuInterface.SudokuValue;

public abstract class AbstractSudoku implements Sudoku {

	private Cell[][] grid;
	private SudokuValue[] tabValid;
	private int nbLines;
	private int nbCols;
	
	public AbstractSudoku (int line, int column,SudokuValue[] validValue){
		this.tabValid=validValue;
		this.nbLines=line;
		this.nbCols=column;
	}
	

	@Override
	public Cell getCell(int line, int column) throws OutOfSudokuException {
		if (isValidPosition(line, column)) {
			return grid[line][column];
		} else {
			throw new OutOfSudokuException(String.format(
					"Pas de cellule en position ligne = %s colonne = %s", line, column));
		}
	}

	@Override
	public void setGrid(Cell[][] grid) {
		this.grid=grid;
		
	}


	@Override
	public int getLineSize() {
		return nbLines;
	}

	@Override
	public int getColumnSize() {
		return nbCols;
	}

	@Override
	public boolean isValidPosition(int line, int column) {
		return line >= 0 && line < getLineSize() && column >= 0
				&& column < getColumnSize();
	}

	@Override
	public SudokuValue[] getValidValue() {
//		Encapsulation
		return Arrays.copyOf(tabValid, tabValid.length);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(grid);
		result = prime * result + Arrays.hashCode(tabValid);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractSudoku other = (AbstractSudoku) obj;
		if (!Arrays.deepEquals(grid, other.grid))
			return false;
		if (!Arrays.equals(tabValid, other.tabValid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AbstractSudoku [grid=" + Arrays.deepToString(grid) + ", tabValid="
				+ Arrays.toString(tabValid) + "]";
	}

}
