package ste.sudoku.etape5Bis.version1;

import ste.sudoku.etape5Bis.heritage.AbstractEcran;




public class EcranV1 extends AbstractEcran {

	private static final String titre= "Sudoku V1";
	private static String format;
	static {
		StringBuilder sb = new StringBuilder();
		sb.append("+---+---+---+---+---+---+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+---+---+---+---+---+---+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+---+---+---+---+---+---+").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("| . . . | . . . | . . . |").append(System.lineSeparator());
		sb.append("+---+---+---+---+---+---+").append(System.lineSeparator());
		format = sb.toString();
		format = format.replace(".", "%s");
	}
	
	public EcranV1() {
		super(format, titre, 81);
	}

	
}
