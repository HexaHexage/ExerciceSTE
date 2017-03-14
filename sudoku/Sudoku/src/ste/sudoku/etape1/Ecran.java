package ste.sudoku.etape1;


public class Ecran {

	public void afficheTitre() {
		System.out.println("SUDOKU");
		System.out.println("======");
	}

	public void afficheSudoku(Sudoku sudo) {
		StringBuilder sb = new StringBuilder("+-----------------------+"); 
		sb.append(System.lineSeparator());
		for (int l = 0; l < 9; l++) {
			
			sb.append("| ");
			
			for (int c = 0; c < 9; c++) {
				sb.append(sudo.getValue(l, c)).append(" ");
				if(c<8 && (c+1)%3==0){
					sb.append("| ");
				}
			}
			sb.append("|").append(System.lineSeparator());
			if(l>0 && (l+1)%3==0){
				sb.append("+-----------------------+").append(System.lineSeparator());
			}
		}
		
		System.out.println(sb);
	}
}
