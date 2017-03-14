package ste.sudoku.etape5.version4;

import ste.sudoku.etape5.heritage.AbstractEcran;

public class EcranV4 extends AbstractEcran {
	
	private static final String titre= "Sudoku V4";
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

	public EcranV4() {
		super(format, titre, 369);
	}
	

}
