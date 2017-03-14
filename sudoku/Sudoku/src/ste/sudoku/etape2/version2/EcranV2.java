package ste.sudoku.etape2.version2;

import ste.sudoku.etape2.sudokuInterface.Ecran;
import ste.sudoku.etape2.sudokuInterface.Sudoku;


public class EcranV2 implements Ecran {


	@Override
	public void afficheTitre() {
		System.out.println("SUDOKU V2");
		System.out.println("=========");
	}


	@Override
	public void afficheSudoku(Sudoku sudo) {
		
		StringBuilder sb = new StringBuilder("+-----------+"); 
		sb.append(System.lineSeparator());
		
		for (int l1 = 0; l1 < 2; l1++) {
			for (int l2 = 0; l2 < 2; l2++) {
				sb.append("| ");
				for (int c1= 0; c1 < 2; c1++) {
					for (int c2 = 0; c2 < 2; c2++) {
						sb.append(sudo.getValue((l1*2)+l2, c2+(c1*2))).append(" ");
					}
					sb.append("| ");
				}
				sb.append(System.lineSeparator());
			}
			sb.append("+-----------+").append(System.lineSeparator());
		}
		
		
		System.out.println(sb);
	}
}
