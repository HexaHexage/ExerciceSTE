package ste.sudoku.etape6Bis.version1;

//import ste.sudoku.etape6Bis.FileReaderV1;
import ste.sudoku.etape6Bis.cellules.Cell1_9;
import ste.sudoku.etape6Bis.fabrique.AbstractSudokuFactory;
import ste.sudoku.etape6Bis.sudokuInterface.Ecran;
import ste.sudoku.etape6Bis.sudokuInterface.Sudoku;


public class SudokuFactoryV1 extends AbstractSudokuFactory {

	@Override
	public Sudoku createSudoku() {
		
		SudokuV1 sudo = new SudokuV1();
		createGrid(Cell1_9.class, sudo);
		createZone(sudo);
//		new FileReaderV1("easy1", sudo).read();
		return sudo;
	}

	@Override
	public Ecran createEcran() {
		return new EcranV1();
	}

}
