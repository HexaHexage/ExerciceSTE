package sudoku.V1;

import etape03.Ecran;
import etape03.Sudoku;
import exception.OutOfSudokuException;

public class EcranV1 implements Ecran {

	// Test
	/*
	 * (non-Javadoc)
	 * 
	 * @see etape01.Ecran#afficheTitre()
	 */
	@Override
	public void afficheTitre() {
		System.out.println("        !!!SUDOKU V1!!!       ");
		System.out.println("==============================");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see etape01.Ecran#afficheSudoku(etape01.Sudoku)
	 */
	@Override
	public void afficheSudoku(Sudoku sudo)
	{
		StringBuilder sb = new StringBuilder("+-------+-------+-------+"); 
		 sb.append(System.lineSeparator());
		try
		{
		 
		 for (int l = 0; l < 9; l++)
		 {
			
			sb.append("| ");
			
			for (int c = 0; c < 9; c++)
			{
				sb.append(sudo.getValue(l, c)).append(" ");
				if(c<8 && (c+1)%3==0)
				{
					sb.append("| ");
				}
			}
			sb.append("|").append("\n");
			if(l>0 && (l+1)%3==0)
			{
				sb.append("+-------+-------+-------+").append(System.lineSeparator()); // line separator est meme chose que \n mais en plus compatible
			}
		  }
		System.out.println(sb);
		}
	 	
		
		catch(OutOfSudokuException e)
		{
			e.printStackTrace();
		}
	}
}
