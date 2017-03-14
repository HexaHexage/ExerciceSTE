package ste.sudoku.etape6Bis.sudokuInterface;

import java.util.Set;

import ste.sudoku.etape6Bis.exceptions.OutOfSudokuException;


public interface Sudoku {

	public Cell getCell(int line, int column) throws OutOfSudokuException;
	
	public int getLineSize();

	public int getColumnSize();

	public boolean isValidPosition(int line, int column);

	public SudokuValue[] getValidValue();
	
	public void setGrid (Cell[][] grid);
	
	public void setMapzone(String typeZone,int num, Zone zone);
	public Set<Cell> getLigne(int nbr)throws OutOfSudokuException;
	public Set<Cell> getCol(int nbr)throws OutOfSudokuException;
	public Set<Cell> getRegion(int nbr)throws OutOfSudokuException;
	public Set<SudokuValue> getLigneValues(int nbr);
	public Set<SudokuValue> getColValues(int nbr);
	public Set<SudokuValue> getRegionValues(int nbr);
	
	public Set<Cell> getRegion(int nbr,int div, int mul)throws OutOfSudokuException;

//	public void lock();
}