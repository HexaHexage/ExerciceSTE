package ste.sudoku.etape4.heritage;

import java.util.Arrays;

import ste.sudoku.etape4.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape4.exceptions.OutOfSudokuException;
import ste.sudoku.etape4.sudokuInterface.Sudoku;

public abstract class AbstractSudoku implements Sudoku {

	private byte[][] grid;
	private byte[] tabValid;
	
	public AbstractSudoku (int line, int column, byte[] validValue){
		this.grid=new byte[line][column];
		this.tabValid=validValue;
	}
	@Override
	public void setValue(byte val, int line, int column)
			throws OutOfSudokuException, InvalidSudokuValueException {
		if (isValidPosition(line, column)) {			
			if (!isValidValue(val)) {
				throw new InvalidSudokuValueException(String.format(
						"Valeur non valid : %s", val));
			}
			grid[line][column] = val;
		} else {
			throw new OutOfSudokuException(String.format(
					"Pas de cellule en position ligne = %s colonne = %s", line, column));
		}


	}

	@Override
	public byte getValue(int line, int column) throws OutOfSudokuException {
		if (isValidPosition(line, column)) {
			return grid[line][column];
		} else {
			throw new OutOfSudokuException(String.format(
					"Pas de cellule en position ligne = %s colonne = %s", line, column));
		}
	}

	@Override
	public int getLineSize() {
		return grid.length;
	}

	@Override
	public int getColumnSize() {
		return grid[0].length;
	}

	@Override
	public boolean isValidPosition(int line, int column) {
		return line >= 0 && line < getLineSize() && column >= 0
				&& column < getColumnSize();
	}

	@Override
	public byte[] getValidValues() {
		return Arrays.copyOf(tabValid, tabValid.length);
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
