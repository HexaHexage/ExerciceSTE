package ste.sudoku.etape3.version4;

import ste.sudoku.etape3.exceptions.OutOfSudokuException;
import ste.sudoku.etape3.sudokuInterface.Ecran;
import ste.sudoku.etape3.sudokuInterface.Sudoku;

public class EcranV4 implements Ecran {
	
	private static String format;
	static {
		StringBuilder sb = new StringBuilder();
		sb.append("+-----------------------+       +-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+       +-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+-------+-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+---------------+-----------------------+---------------+").append(System.lineSeparator());
		sb.append("                | . . . | . . . | . . . |                ").append(System.lineSeparator());
		sb.append("                | . . . | . . . | . . . |                ").append(System.lineSeparator());
		sb.append("                | . . . | . . . | . . . |                ").append(System.lineSeparator());
		sb.append("+---------------+-----------------------+---------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . | . . . | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+-------+-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+       +-----------------------+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |       | . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+-----------------------+       +-----------------------+").append(System.lineSeparator());
		
		format = sb.toString();
		//le % indique que l'on doit remplacer cette chaine, le 1 indique le nombre de caractères à générer, le d indique qu'il s'agit d'un nombre
//		format = format.replace(".", "%1d");
		//ou
		format = format.replace(".", "%d");
//		System.out.println(format);
	}

	@Override
	public void afficheTitre() {
		System.out.println("SUDOKU V3");
		System.out.println("=========");
	}

	@Override
	public void afficheSudoku(Sudoku sudo) {
		Byte[] values = new Byte[369];
		int pos = 0;
		try {
			for (int i = 0; i < 21; i++) {
				for (int j = 0; j < 21; j++) {
					if(sudo.isValidPosition(i, j)){
							values[pos++]=sudo.getValue(i, j);
					}
				}
			}
			System.out.println(String.format(format, values));
		} catch (OutOfSudokuException e) {
			e.printStackTrace();
		}

	}

}
