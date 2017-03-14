package sudoku.V3;

import etape03.AbstractSudokuFactory;
import etape03.Ecran;
import etape03.Sudoku;

public class SudokuFactoryV3 extends AbstractSudokuFactory
{

	@Override
	public Sudoku createSudoku() {
		// TODO Auto-generated method stub
		return new SudokuV3();
	}

	@Override
	public Ecran createEcran() {
		// TODO Auto-generated method stub
		return new EcranV3();
	}

}
