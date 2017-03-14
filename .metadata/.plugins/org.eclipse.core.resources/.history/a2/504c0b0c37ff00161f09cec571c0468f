package sudoku.V3;

import Heritage.AbstractEcran;
import etape04.Ecran;
import etape04.Sudoku;
import exception.OutOfSudokuException;


public class EcranV3 extends AbstractEcran
{
	
	private static final String titre= "       !!!SUDOKU V3!!!        ";
	private static String format;
	
	
	static {
		StringBuilder sb = new StringBuilder();
		sb.append("┌───────┬───────┬───────┐       ┌───────┬───────┬───────┐").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("├───────┼───────┼───────┤       ├───────┼───────┼───────┤").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("├───────┼───────┼───────┼───────┼───────┼───────┼───────┤").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("└───────┴───────┼───────┼───────┼───────┼───────┴───────┘").append(System.lineSeparator());
		sb.append("                │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │                ").append(System.lineSeparator());
		sb.append("                │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │                ").append(System.lineSeparator());
		sb.append("                │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │                ").append(System.lineSeparator());
		sb.append("┌───────┬───────┼───────┼───────┼───────┼───────┬───────┐").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("├───────┼───────┼───────┼───────┼───────┼───────┼───────┤").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("├───────┼───────┼───────┤       ├───────┼───────┼───────┤").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("│ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │       │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │ ⋆ ⋆ ⋆ │").append(System.lineSeparator());
		sb.append("└───────┴───────┴───────┘       └───────┴───────┴───────┘").append(System.lineSeparator());
		format = sb.toString();
		//le % indique que l'on doit remplacer cette chaine, le 1 indique le nombre de caractères à générer,
		// le d indique qu'il s'agit d'un nombre
        //		format = format.replace(".", "%1d");
		//ou
		format = format.replace("⋆", "%d");
        //		System.out.println(format);
	}
	
	public EcranV3()
	{
		super(format, titre, 369);
	}
	
	/*Les fonctions sont redefinies dans l heritage donc mise en comentaire ici */
	/*------------------------------------------------------------------------*/
	
	/*
	@Override
	public void afficheTitre() {
		System.out.println("        !!!SUDOKU V3!!!       ");
		System.out.println("==============================");
	}
	*/
	
	
	/*
	@Override
	public void afficheSudoku(Sudoku sudo)
	{
		Byte[] values = new Byte[369];
		int pos = 0;
		
			for (int i = 0; i < 21; i++) 
			{
				for (int j = 0; j < 21; j++)
				{
					try
					{
						    byte inter=sudo.getValue(i, j);
							values[pos++]=inter;
					}
					catch (OutOfSudokuException e)
					{
					 
					}
				}
			}
			System.out.println(String.format(format, values));
		 

	}
	*/

}