package ste.sudoku.etape2.version3;

import ste.sudoku.etape2.sudokuInterface.Ecran;
import ste.sudoku.etape2.sudokuInterface.Sudoku;


public class EcranV3 implements Ecran {
	
	private static String format;
	static {
		StringBuilder sb = new StringBuilder();
		sb.append("            +-----------+            ").append(System.lineSeparator());
		sb.append("            | . . | . . |            ").append(System.lineSeparator());
		sb.append("            | . . | . . |            ").append(System.lineSeparator());
		sb.append("            +-----------+            ").append(System.lineSeparator());
		sb.append("            | . . | . . |            ").append(System.lineSeparator());
		sb.append("            | . . | . . |            ").append(System.lineSeparator());
		sb.append("+-----------------------------------+").append(System.lineSeparator());
		sb.append("| . . | . . | . . | . . | . . | . . |").append(System.lineSeparator());
		sb.append("| . . | . . | . . | . . | . . | . . |").append(System.lineSeparator());
		sb.append("+-----------------------------------+").append(System.lineSeparator());
		sb.append("| . . | . . | . . | . . | . . | . . |").append(System.lineSeparator());
		sb.append("| . . | . . | . . | . . | . . | . . |").append(System.lineSeparator());
		sb.append("+-----------------------------------+").append(System.lineSeparator());
		sb.append("            | . . | . . |            ").append(System.lineSeparator());
		sb.append("            | . . | . . |            ").append(System.lineSeparator());
		sb.append("            +-----------+            ").append(System.lineSeparator());
		sb.append("            | . . | . . |            ").append(System.lineSeparator());
		sb.append("            | . . | . . |            ").append(System.lineSeparator());
		sb.append("            +-----------+            ").append(System.lineSeparator());
		
		format = sb.toString();
		//le % indique que l'on doit remplacer cette chaine, le 1 indique le nombre 
		//de caractères à générer, le d indique qu'il s'agit d'un nombre
		//format = format.replace(".", "%1d");
		//ou
		format = format.replace(".", "%d");
	}

	/* (non-Javadoc)
	 * @see ste.sudoku.etape2.Ecran#afficheTitre()
	 */
	@Override
	public void afficheTitre() {
		System.out.println("SUDOKU V3");
		System.out.println("=========");
	}

	/* (non-Javadoc)
	 * @see ste.sudoku.etape2.Ecran#afficheSudoku(ste.sudoku.etape2.SudokuV1)
	 */
	@Override
	public void afficheSudoku(Sudoku sudo) {
		Byte[] values = new Byte[80];
		int pos = 0;
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				byte val =sudo.getValue(i, j);
				if(val>=0){
					values[pos++]=val;
				}
//				else{
//					System.out.println("NOT VALID "+i+" "+j);
//				}
			}
		}		
		
		System.out.println(String.format(format, values));
	}
}
