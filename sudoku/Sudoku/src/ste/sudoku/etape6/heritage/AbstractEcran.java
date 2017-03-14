package ste.sudoku.etape6.heritage;

import ste.sudoku.etape6.exceptions.OutOfSudokuException;
import ste.sudoku.etape6.sudokuInterface.Ecran;
import ste.sudoku.etape6.sudokuInterface.Sudoku;
import ste.sudoku.etape6.sudokuInterface.SudokuValue;



public abstract class AbstractEcran implements Ecran {

	private String format;
	private String titre;
	private String line;
	private int nbValue;
	
	public AbstractEcran(String format, String titre,int nbValue) {
		super();
		this.format = format;
		this.titre = titre;
		StringBuilder builder = new StringBuilder();
		for(int i = titre.length() ; i>0;i--){
			builder.append('=');
		}
		this.line = builder.toString();
		this.nbValue = nbValue;
	}
	
	@Override
	public void afficheTitre() {
		System.out.println(titre);
		System.out.println(line);
	}

	@Override
	public void afficheSudoku(Sudoku sudo) {

		String[] valueTab = new String[this.nbValue];
		int pos = 0;
		try {
			for (int lig = 0; lig < sudo.getLineSize(); lig++) {
				for (int col = 0; col < sudo.getColumnSize(); col++) {
					if(sudo.isValidPosition(lig, col)){
						SudokuValue v = sudo.getCell(lig, col).getValue();
						valueTab[pos++] = v==null ? "." : v.toString();
					}
				}
			}
		System.out.println(String.format(format, (Object[])valueTab));
		} catch (OutOfSudokuException e) {
			e.printStackTrace();
		} 
	}

	
}
