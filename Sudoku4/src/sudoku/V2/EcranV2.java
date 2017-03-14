package sudoku.V2;

import Heritage.AbstractEcran;
import etape04.Ecran;
import etape04.Sudoku;
import exception.OutOfSudokuException;

public class EcranV2 extends AbstractEcran 
{
	
	private static final String titre= "       !!!SUDOKU V2!!!        ";
	private static String format;
	static {
		StringBuilder sb = new StringBuilder();
		sb.append("┌─────┬─────┐").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ │ ⋆ ⋆ │").append(System.lineSeparator());	
		sb.append("│ ⋆ ⋆ │ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("├─────┼─────┤").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ │ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ │ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("└─────┴─────┘").append(System.lineSeparator());
	
		format = sb.toString();
		//le % indique que l'on doit remplacer cette chaine, le 1 indique le nombre de caractères à générer,
		// le d indique qu'il s'agit d'un nombre
        //		format = format.replace(".", "%1d");
		//ou
		format = format.replace("⋆", "%d");
        //		System.out.println(format);
	}
	
	
	public EcranV2(String format, String titre, int nbValue)
	{
		super(format, titre, nbValue);
		// TODO Auto-generated constructor stub
	}
	
	public EcranV2()
	{
		super(format, titre, 16);
	}

	// Test
	/*
	 * (non-Javadoc)
	 * 
	 * @see etape01.Ecran#afficheTitre()
	 */
	
	/*
	@Override
	public void afficheTitre() {
		System.out.println("       !!!SUDOKU V2!!!        ");
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
		try 
		{
			StringBuilder sb = new StringBuilder("+-----------+");
			sb.append(System.lineSeparator());

			for (int l1 = 0; l1 < 2; l1++) 
			{
				for (int l2 = 0; l2 < 2; l2++) 
				{
					sb.append("| ");
					for (int c1 = 0; c1 < 2; c1++) 
					{
						for (int c2 = 0; c2 < 2; c2++) 
						{
							sb.append(sudo.getValue((l1 * 2) + l2, c2 + (c1 * 2))).append(" ");
						}
						sb.append("| ");
					}
					sb.append(System.lineSeparator());
				}
				sb.append("+-----------+").append(System.lineSeparator());
			}

			System.out.println(sb);
		} 
		catch (OutOfSudokuException e) 
		{
			
		}

	}
	*/
}
