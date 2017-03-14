package ste.sudoku.etape5Bis.version3;

import ste.sudoku.etape5Bis.heritage.AbstractEcran;

public class EcranV3 extends AbstractEcran {
	
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
		format = format.replace(".", "%s");
	}

	public EcranV3() {
		super(format, titre, 369);
	}
	

}
