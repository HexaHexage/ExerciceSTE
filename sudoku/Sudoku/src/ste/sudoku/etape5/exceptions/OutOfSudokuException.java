package ste.sudoku.etape5.exceptions;

public class OutOfSudokuException extends SudokuException {

	private static final long serialVersionUID = 1L;

	public OutOfSudokuException() {
	}

	public OutOfSudokuException(String message) {
		super(message);
	}

	public OutOfSudokuException(Throwable cause) {
		super(cause);
	}

	public OutOfSudokuException(String message, Throwable cause) {
		super(message, cause);
	}

}
