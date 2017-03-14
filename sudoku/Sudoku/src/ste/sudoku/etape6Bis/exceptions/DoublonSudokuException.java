package ste.sudoku.etape6Bis.exceptions;

public class DoublonSudokuException extends SudokuException {

	private static final long serialVersionUID = 1L;

	public DoublonSudokuException() {
	}

	public DoublonSudokuException(String message) {
		super(message);
	}

	public DoublonSudokuException(Throwable cause) {
		super(cause);
	}

	public DoublonSudokuException(String message, Throwable cause) {
		super(message, cause);
	}

}
