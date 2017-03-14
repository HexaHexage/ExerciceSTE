package ste.sudoku.etape6.version3;

import ste.sudoku.etape6.cellules.Cell1_4;
import ste.sudoku.etape6.cellules.Zone1_4;
import ste.sudoku.etape6.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape6.sudokuInterface.Ecran;
import ste.sudoku.etape6.sudokuInterface.Sudoku;
import ste.sudoku.etape6.sudokuInterface.Zone;


public class SudokuFactoryV3 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		
		int size = 5*4;
		SudokuV3 sudo = new SudokuV3();
		
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
		
		
		Cell1_4[][] grid = new Cell1_4[sudo.getLineSize()][sudo.getColumnSize()];
		sudo.setGrid(grid);
		for (int l = 0; l < sudo.getLineSize(); l++) {
			for (int c = 0; c < sudo.getColumnSize(); c++) {
				if(sudo.isValidPosition(l,c)){
					grid[l][c]=new Cell1_4();
					System.out.println("CELL "+l+" "+c+" ZONE "+(l>7 ? c+12
							: l<4 ? c+8
							:c));
					grid[l][c].addZone(zoneLine[ l>7 ? (l+8)
												: c>3 && l>3 ? l+(c/4*4)
												:l		
					                            ]);
					grid[l][c].addZone(zoneCol[l>7 ? c+12
												: l<4 ? c+8
												:c
					                           ]);
//					grid[l][c].addZone(zoneRegion[l<10 ? (((l/2)*2)+(c/2))
//													: l<16 ? ((l/2)*3)+(c/2)+1
//													: 
//					                              ]);
				}
			}
		}
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV3();
	}
	
	public static void main(String args[]){
		new SudokuFactoryV3().createSudoku();
	}

}
