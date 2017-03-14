package ste.sudoku.etape5.exceptions;

public class InvalidSudokuValueException extends SudokuException {

	private static final long serialVersionUID = 1L;

	public InvalidSudokuValueException() {
	}

	public InvalidSudokuValueException(String message) {
		super(message);
	}

	public InvalidSudokuValueException(Throwable cause) {
		super(cause);
	}

	public InvalidSudokuValueException(String message, Throwable cause) {
		super(message, cause);
	}

}
