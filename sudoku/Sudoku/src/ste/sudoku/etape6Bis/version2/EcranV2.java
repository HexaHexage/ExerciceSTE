package ste.sudoku.etape6Bis.version2;

import ste.sudoku.etape6Bis.heritage.AbstractEcran;




public class EcranV2 extends AbstractEcran {

	private static final String titre= "Sudoku V2";
	private static String format;
	static {
		StringBuilder sb = new StringBuilder();
		sb.append("+-----+-----+").append(System.lineSeparator());
		sb.append("| . . | . . |").append(System.lineSeparator());
		sb.append("| . . | . . |").append(System.lineSeparator());
		sb.append("+-----+-----+").append(System.lineSeparator());
		sb.append("| . . | . . |").append(System.lineSeparator());
		sb.append("| . . | . . |").append(System.lineSeparator());
		sb.append("+-----+-----+").append(System.lineSeparator());
		format = sb.toString();
		format = format.replace(".", "%s");
	}
	
	public EcranV2() {
		super(format, titre, 16);
	}
}
