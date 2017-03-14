package ste.sudoku.etape5Bis.fabrique;

import ste.sudoku.etape5Bis.sudokuInterface.Cell;
import ste.sudoku.etape5Bis.sudokuInterface.Ecran;
import ste.sudoku.etape5Bis.sudokuInterface.Sudoku;

public abstract class AbstractSudokuFactory {
	
	public static final int VERSION1 = 1;
	public static final int VERSION2 = 2;
	public static final int VERSION3 = 3;
	
	public static final AbstractSudokuFactory getFactory(int type){
		AbstractSudokuFactory factory = null;
//		switch (type) {
//		case VERSION1:
//			factory = new SudokuFactoryV1();
//			break;
//		case VERSION2:
//			factory = new SudokuFactoryV2();
//			break;
//		case VERSION3:
//			factory = new SudokuFactoryV3();
//			break;
//		default:
//			break;
//		}
//		return factory;
		try{
			
			factory = (AbstractSudokuFactory) Class.forName("ste.sudoku.etape5Bis.version"+type+".SudokuFactoryV"+type).newInstance();
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
			
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract Sudoku createSudoku();
	public abstract Ecran createEcran();
	public void fillGrid(Class<? extends Cell> cellClass, Sudoku sudo){
		Cell[][] grid = new Cell[sudo.getLineSize()][sudo.getColumnSize()];
		sudo.setGrid(grid);
		for (int i = 0; i < sudo.getLineSize(); i++) {
			for (int j = 0; j < sudo.getColumnSize(); j++) {
				if(sudo.isValidPosition(i,j)){
					try {
						grid[i][j]=cellClass.newInstance();
					} catch (InstantiationException | IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}		
	}
}
