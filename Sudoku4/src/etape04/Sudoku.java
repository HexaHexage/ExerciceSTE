package etape04;

import exception.OutOfSudokuException;


public interface Sudoku {

	void setValue(byte i, int ligne, int colonne) throws OutOfSudokuException, exception.InvalidSudokuValueException;

	/**La méthode renvoit la valeur d'une case
	 * 
	 * @param ligne  numéro de la ligne dans le sudoku
	 * @param colonne    numéro de la colonne dans le sudoku
	 * @return la valeur dans la case line column 
	 * @throws OutOfSudokuException 
	 */
	byte getValue(int ligne, int colonne) throws OutOfSudokuException;

	int getLineSize();

	int getColumnSize();

	boolean isValidPosition(int line, int column);

	boolean isValidValue(byte val);

	byte[] getValidValues();

}