package ste.sudoku.etape6.version1;

import ste.sudoku.etape6.FileReaderV1;
import ste.sudoku.etape6.cellules.Cell1_9;
import ste.sudoku.etape6.cellules.Zone1_9;
import ste.sudoku.etape6.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape6.sudokuInterface.Ecran;
import ste.sudoku.etape6.sudokuInterface.Sudoku;
import ste.sudoku.etape6.sudokuInterface.Zone;


public class SudokuFactoryV1 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		
		SudokuV1 sudo = new SudokuV1();
		int size = sudo.getLineSize();

		Zone[] zoneLine = new Zone1_9[size];
		for(int i = 0;i<size;i++){
			zoneLine[i] = new Zone1_9();
			sudo.setMapzone("ligne", i, zoneLine[i]);
		}	
		Zone[] zoneCol = new Zone1_9[size];
		for(int i = 0;i<size;i++){
			zoneCol[i] = new Zone1_9(); 
			sudo.setMapzone("colonne", i, zoneCol[i]);
		}
		Zone[] zoneRegion = new Zone1_9[size];
		for(int i = 0;i<size;i++){
			zoneRegion[i] = new Zone1_9(); 
			sudo.setMapzone("region", i, zoneRegion[i]);
		}
		Cell1_9[][] grid = new Cell1_9[9][9];
		sudo.setGrid(grid);
		
		for (int i = 0; i < sudo.getLineSize(); i++) {
			for (int j = 0; j < sudo.getColumnSize(); j++) {
				if(sudo.isValidPosition(i,j)){
					grid[i][j]=new Cell1_9();
					grid[i][j].addZone(zoneLine[i]);
					grid[i][j].addZone(zoneCol[j]);
					grid[i][j].addZone(zoneRegion[((i/3)*3)+(j/3)]);
					
				}
			}
		}	
		new FileReaderV1("easy1", sudo).read();
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV1();
	}

}
