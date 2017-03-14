package etape03;

import etape03.Ecran;
import etape03.Sudoku;
import sudoku.V1.SudokuFactoryV1;
import sudoku.V2.SudokuFactoryV2;
import sudoku.V3.SudokuFactoryV3;

public abstract class AbstractSudokuFactory
{
	public static final int VERSION1 = 1;
	public static final int VERSION2 = 2;
	public static final int VERSION3 = 3;
	
	
	public static final AbstractSudokuFactory getFactory(int type){
		AbstractSudokuFactory factory = null;
		switch (type) 
		{
		case VERSION1:
			factory = new SudokuFactoryV1();
			break;
		case VERSION2:
			factory = new SudokuFactoryV2();
			break;
		case VERSION3:
			factory = new SudokuFactoryV3();
			break;
		
		default:
			break;
		}
		return factory;
	}
	public abstract Sudoku createSudoku();
	public abstract Ecran createEcran();
}
