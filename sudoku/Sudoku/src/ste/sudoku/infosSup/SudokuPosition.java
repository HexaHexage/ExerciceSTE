package ste.sudoku.infosSup;

public interface SudokuPosition {

	int getLine();
	int getColumn();
	int getSquare();
	boolean sameSquare(SudokuPosition pos);
	boolean sameLine(SudokuPosition pos);
	boolean sameColumn(SudokuPosition pos);
}
