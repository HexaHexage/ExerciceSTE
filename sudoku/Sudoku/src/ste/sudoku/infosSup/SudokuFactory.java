package ste.sudoku.infosSup;

import java.util.Set;

public interface SudokuFactory {

	Sudoku createSudoku();
	SudokuPosition createSudokuPosition(int line, int column);
	Set< ? extends SudokuValue> getSudokuValueSet();
	Set<SudokuPosition> getLinePositionSet(int line);
	Set<SudokuPosition> getColumnPositionSet(int column);
	Set<SudokuPosition> getSquarePositionSet(int square);
}
