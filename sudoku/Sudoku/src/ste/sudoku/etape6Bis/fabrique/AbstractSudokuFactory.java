package ste.sudoku.etape6Bis.fabrique;

import ste.sudoku.etape6Bis.sudokuInterface.Cell;
import ste.sudoku.etape6Bis.sudokuInterface.Ecran;
import ste.sudoku.etape6Bis.sudokuInterface.Sudoku;
import ste.sudoku.etape6Bis.cellules.Cell1_9;
import ste.sudoku.etape6Bis.cellules.ZoneImpl;
import ste.sudoku.etape6Bis.exceptions.OutOfSudokuException;
import ste.sudoku.etape6Bis.sudokuInterface.Zone;

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
	public void createGrid(Class<? extends Cell> cellClass, Sudoku sudo){
		
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
	public void createZone(Sudoku sudo){
		int size = sudo.getLineSize();

		Zone[] zoneLine = new ZoneImpl[size];
		for(int i = 0;i<size;i++){
			zoneLine[i] = new ZoneImpl();
			sudo.setMapzone("ligne", i, zoneLine[i]);
		}	
		Zone[] zoneCol = new ZoneImpl[size];
		for(int i = 0;i<size;i++){
			zoneCol[i] = new ZoneImpl(); 
			sudo.setMapzone("colonne", i, zoneCol[i]);
		}
		Zone[] zoneRegion = new ZoneImpl[size];
		for(int i = 0;i<size;i++){
			zoneRegion[i] = new ZoneImpl(); 
			sudo.setMapzone("region", i, zoneRegion[i]);
		}
		Cell c; 
		int nbRegion = 3;
		if(size==4)nbRegion=2;
		for (int i = 0; i < sudo.getLineSize(); i++) {
			for (int j = 0; j < sudo.getColumnSize(); j++) {
				if(sudo.isValidPosition(i,j)){
					try {
						c = sudo.getCell(i, j);
						c.addZone(zoneLine[i]);
						c.addZone(zoneCol[j]);
						c.addZone(zoneRegion[((i/nbRegion)*nbRegion)+(j/nbRegion)]);
					} catch (OutOfSudokuException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
