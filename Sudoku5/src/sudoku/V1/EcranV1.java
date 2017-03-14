package sudoku.V1;

import Heritage.AbstractEcran;
import etape04.Ecran;
import etape04.Sudoku;
import exception.OutOfSudokuException;

public class EcranV1 extends AbstractEcran {

	private static final String titre= "       !!!SUDOKU V1!!!        ";
	private static String format;
	static {
		StringBuilder sb = new StringBuilder();
		sb.append("┌───────┬───────┬───────┐").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("├───────┼───────┼───────┤").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("├───────┼───────┼───────┤").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("└───────┴───────┴───────┘").append(System.lineSeparator());
		
		format = sb.toString();
		//le % indique que l'on doit remplacer cette chaine, le 1 indique le nombre de caractères à générer,
		// le d indique qu'il s'agit d'un nombre
        //		format = format.replace(".", "%1d");
		//ou
		format = format.replace("⋆", "%s");
        //		System.out.println(format);
	}
	
	public EcranV1(String format, String titre, int nbValue) 
	{
		super(format, titre, nbValue);
		// TODO Auto-generated constructor stub
	}
	
	public EcranV1()
	{
		super(format, titre, 81);
	}

	// Test
	/*
	 * (non-Javadoc)
	 * 
	 * @see etape01.Ecran#afficheTitre()
	 */
	
	/*
	@Override
	public void afficheTitre()
	{
		System.out.println("        !!!SUDOKU V1!!!       ");
		System.out.println("==============================");
	}
	*/
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see etape01.Ecran#afficheSudoku(etape01.Sudoku)
	 */
	
	/*
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
	*/
}
