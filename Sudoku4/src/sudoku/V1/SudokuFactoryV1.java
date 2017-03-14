package sudoku.V1;

import etape04.AbstractSudokuFactory;
import etape04.Ecran;
import etape04.Sudoku;
import sudoku.V3.SudokuV3;

public class SudokuFactoryV1 extends AbstractSudokuFactory
{

	@Override
	public Sudoku createSudoku() {
		// TODO Auto-generated method stub
		return new SudokuV1(9, 9, new byte[]{1,2,3,4,5,6,7,8,9});
	}

	@Override
	public Ecran createEcran()
	{
		// TODO Auto-generated method stub
		return new EcranV1();
	}

}
