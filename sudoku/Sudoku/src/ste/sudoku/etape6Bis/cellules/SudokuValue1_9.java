package ste.sudoku.etape6Bis.cellules;

import ste.sudoku.etape6Bis.sudokuInterface.SudokuValue;

public enum SudokuValue1_9 implements SudokuValue{
	VAL_1("1"), VAL_2("2"), VAL_3("3"), VAL_4("4"), VAL_5("5"), VAL_6("6"), VAL_7("7"), VAL_8("8"), VAL_9("9");

	private String display;

	// constructeur toujours en private pour un enum
	private SudokuValue1_9(String display) {
		this.display = display;
	}
	
	@Override
	public String toString() {
		return this.display;
	}
}
