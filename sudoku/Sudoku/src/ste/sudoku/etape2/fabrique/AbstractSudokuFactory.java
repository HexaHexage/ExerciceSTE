package ste.sudoku.etape2.fabrique;

import ste.sudoku.etape2.sudokuInterface.Ecran;
import ste.sudoku.etape2.sudokuInterface.Sudoku;
import ste.sudoku.etape2.version1.SudokuFactoryV1;
import ste.sudoku.etape2.version2.SudokuFactoryV2;
import ste.sudoku.etape2.version3.SudokuFactoryV3;
import ste.sudoku.etape2.version4.SudokuFactoryV4;

public abstract class AbstractSudokuFactory {
	
	public static final int VERSION1 = 1;
	public static final int VERSION2 = 2;
	public static final int VERSION3 = 3;
	public static final int VERSION4 = 4;
	
	public static final AbstractSudokuFactory getFactory(int type){
		AbstractSudokuFactory factory = null;
		switch (type) {
		case VERSION1:
			factory = new SudokuFactoryV1();
			break;
		case VERSION2:
			factory = new SudokuFactoryV2();
			break;
		case VERSION3:
			factory = new SudokuFactoryV3();
			break;
		case VERSION4:
			factory = new SudokuFactoryV4();
			break;
		default:
			break;
		}
		return factory;
	}
	public abstract Sudoku createSudoku();
	public abstract Ecran createEcran();
}
