package ste.sudoku.etape6.version2;

import ste.sudoku.etape6.cellules.Cell1_4;
import ste.sudoku.etape6.cellules.Zone1_4;
import ste.sudoku.etape6.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape6.sudokuInterface.Ecran;
import ste.sudoku.etape6.sudokuInterface.Sudoku;
import ste.sudoku.etape6.sudokuInterface.Zone;
;

public class SudokuFactoryV2 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		
		SudokuV2 sudo = new SudokuV2();
		int size = sudo.getLineSize();
		
		Zone[] zoneLine = new Zone1_4[size];		
		for(int i = 0;i<size;i++){
			zoneLine[i] = new Zone1_4();
			sudo.setMapzone("ligne", i, zoneLine[i]);
		}
		Zone[] zoneCol = new Zone1_4[size];
		for(int i = 0;i<size;i++){
			zoneCol[i] = new Zone1_4(); 
			sudo.setMapzone("colonne", i, zoneCol[i]);
		}
		Zone[] zoneRegion = new Zone1_4[size];
		for(int i = 0;i<size;i++){
			zoneRegion[i] = new Zone1_4();
			sudo.setMapzone("region", i, zoneRegion[i]);
		}
		
		
		Cell1_4[][] grid = new Cell1_4[4][4];
		sudo.setGrid(grid);
		for (int i = 0; i < sudo.getLineSize(); i++) {
			for (int j = 0; j < sudo.getColumnSize(); j++) {
				if(sudo.isValidPosition(i,j)){
					grid[i][j]=new Cell1_4();
					grid[i][j].addZone(zoneLine[i]);
					grid[i][j].addZone(zoneCol[j]);
					grid[i][j].addZone(zoneRegion[((i/2)*2)+(j/2)]);
				}
			}
		}		
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV2();
	}

}
