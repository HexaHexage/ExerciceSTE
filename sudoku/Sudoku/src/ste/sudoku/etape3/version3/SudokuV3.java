package ste.sudoku.etape3.version3;

import java.util.Arrays;

import ste.sudoku.etape3.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape3.exceptions.OutOfSudokuException;
import ste.sudoku.etape3.sudokuInterface.Sudoku;
import ste.sudoku.infosSup.SudokuValue;


public class SudokuV3 implements Sudoku  {
	
	private byte[][] grid = new byte[12][12];
	private byte[] tabValid = {1,2,3,4};

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
	public boolean isValidPosition(int line, int column) {
		boolean isValid = line >= 0 && line < getLineSize() && column >= 0
				&& column < getColumnSize(); 
		if(isValid){
			int leftLimite = getValidValues().length ;
			int rightLimite = getLineSize()-leftLimite;
			isValid = !( (line<leftLimite||line>=rightLimite)  && (column<leftLimite||column>=rightLimite) );
		}
		return isValid;		
				
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SudokuV3 other = (SudokuV3) obj;
		if (!Arrays.deepEquals(grid, other.grid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SudokuV3 [grid=" + Arrays.deepToString(grid) + "]";
	}

	@Override
	public int getLineSize() {
		return 12;
	}

	@Override
	public int getColumnSize() {
		return 12;
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
