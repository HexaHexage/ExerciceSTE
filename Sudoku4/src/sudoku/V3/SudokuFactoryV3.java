package sudoku.V3;

import etape04.AbstractSudokuFactory;
import etape04.Ecran;
import etape04.Sudoku;

public class SudokuFactoryV3 extends AbstractSudokuFactory
{

	@Override
	public Sudoku createSudoku() 
	{
		// TODO Auto-generated method stub
		return new SudokuV3(21, 21, new byte[]{1,2,3,4,5,6,7,8,9});
	}

	@Override
	public Ecran createEcran()
	{
		// TODO Auto-generated method stub
		return new EcranV3();
	}

}