package sudoku.V2;

import etape03.AbstractSudokuFactory;
import etape03.Ecran;
import etape03.Sudoku;

public class SudokuFactoryV2 extends AbstractSudokuFactory
{

	@Override
	public Sudoku createSudoku() {
		// TODO Auto-generated method stub
		return new SudokuV2();
	}

	@Override
	public Ecran createEcran() {
		// TODO Auto-generated method stub
		return new EcranV2();
	}

}
