package ste.sudoku.etape3.version2;

import java.util.Arrays;

import ste.sudoku.etape3.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape3.exceptions.OutOfSudokuException;
import ste.sudoku.etape3.sudokuInterface.Sudoku;

public class SudokuV2 implements Sudoku  {
	
	private byte[][] grid = new byte[4][4];
	private final byte[] tabValid = {1,2,3,4};

	@Override
	public void setValue(byte val, int line, int column) throws OutOfSudokuException, InvalidSudokuValueException {
		if (isValidPosition(line, column)) {
			if (!isValidValue(val)) {
				throw new InvalidSudokuValueException(String.format("Valeur non valid : %s",val));
			}			grid[line][column] = val;
		}else{
			throw new OutOfSudokuException(String.format("Pas de cellule en position ligne = %s colonne = %s",line, column));
		}
	}

	@Override
	public byte getValue(int line, int column) throws OutOfSudokuException {
		if (isValidPosition(line, column)) {
			return grid[line][column];
		} else {
			throw new OutOfSudokuException(String.format("Pas de cellule en position ligne = %s colonne = %s",line, column));
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(grid);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean egal;
		if (this == obj) {
			egal = true;
		} else if (obj == null) {
			egal = false;
		} else if (getClass() != obj.getClass()) {
			egal = false;
		} else {
			SudokuV2 other = (SudokuV2) obj;
			if (!Arrays.deepEquals(grid, other.grid)) {
				egal = false;
			} else {
				egal = true;
			}
		}
		return egal;
	}

	@Override
	public String toString() {
		return "Sudoku [grid=" + Arrays.deepToString(grid) + "]";
	}

	@Override
	public int getLineSize() {
		return 4;
	}

	@Override
	public int getColumnSize() {
		return 4;
	}
	@Override
	public boolean isValidPosition(int line, int column) {
		return line >= 0 && line < getLineSize() && column >= 0
				&& column < getColumnSize();
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

}
