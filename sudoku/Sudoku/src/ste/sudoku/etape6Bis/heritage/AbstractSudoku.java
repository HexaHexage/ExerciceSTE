package ste.sudoku.etape6Bis.heritage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ste.sudoku.etape6Bis.exceptions.OutOfSudokuException;
import ste.sudoku.etape6Bis.sudokuInterface.Cell;
import ste.sudoku.etape6Bis.sudokuInterface.Sudoku;
import ste.sudoku.etape6Bis.sudokuInterface.SudokuValue;
import ste.sudoku.etape6Bis.sudokuInterface.Zone;


public abstract class AbstractSudoku implements Sudoku {

	protected Cell[][] grid;
	protected SudokuValue[] tabValid;
	protected Map<Integer,Set<Cell>> mapLigne = new HashMap<Integer,Set<Cell>>();
	protected Map<Integer,Set<Cell>> mapCol = new HashMap<Integer,Set<Cell>>();
	protected Map<Integer,Set<Cell>> mapRegion = new HashMap<Integer,Set<Cell>>();
	protected Map<String, Map<Integer,Zone>> mapZone = new HashMap<String, Map<Integer,Zone>>();
	protected int ligne, colonne;
	public AbstractSudoku (int l, int c, SudokuValue[] validValue){
		this.tabValid=validValue;
		ligne=l; colonne=c;
	}
	

	@Override
	public Cell getCell(int line, int column) throws OutOfSudokuException {
		if (isValidPosition(line, column)) {
			return grid[line][column];
		} else {
			throw new OutOfSudokuException(String.format(
					"Pas de cellule en position ligne = %s colonne = %s", line, column));
		}
	}

	@Override
	public void setGrid(Cell[][] grid) {
		this.grid=grid;
		
	}
	
	@Override
	public void setMapzone(String typeZone,int num, Zone zone){
		Map<Integer,Zone> hashMap = this.mapZone.get(typeZone);
		if(!this.mapZone.containsKey(typeZone)){
			hashMap = new HashMap<Integer,Zone>();
			this.mapZone.put(typeZone,hashMap);
		}
		hashMap.put(num,zone);	
	}

	@Override
	public Set<Cell> getLigne(int nbr) throws OutOfSudokuException {
		if(!mapLigne.containsKey(nbr))
		{
			Set<Cell> cells = new HashSet<Cell>();
			for (int i = 0; i < grid[nbr].length; i++) {
				cells.add(getCell(nbr,i));				
			}
			mapLigne.put(nbr, cells);
		}
		return  mapLigne.get(nbr);
	}

	@Override
	public Set<Cell> getCol(int nbr) throws OutOfSudokuException {
		if(!mapCol.containsKey(nbr))
		{
			Set<Cell> cells = new HashSet<Cell>();
			for (int i = 0; i < grid[nbr].length; i++) {
				cells.add(getCell(i,nbr));				
			}
			mapCol.put(nbr, cells);
		}
		return  mapCol.get(nbr);

	}

	public Set<Cell> getRegion(int nbr,int div, int mul) throws OutOfSudokuException{
		if(!mapRegion.containsKey(nbr)){
			int col = (nbr%div)*mul;
			int ligne  = (nbr/div)*mul;
			Set<Cell> cells = new HashSet<Cell>();
			for (int l = ligne; l < ligne+mul; l++) {
				for (int c = col; c < col+mul; c++) {
					cells.add(getCell(l,c));
				}
			}
			mapRegion.put(nbr,cells);
		}
		return mapRegion.get(nbr);
	}
	
	@Override
	public Set<SudokuValue> getLigneValues(int nbr) {
		
		Set<SudokuValue> retVal = null;
		retVal = this.mapZone.get("ligne").get(nbr).getSudokuSet();
		return retVal;
	}

	@Override
	public Set<SudokuValue> getColValues(int nbr) {
		Set<SudokuValue> retVal = null;
		retVal = this.mapZone.get("colonne").get(nbr).getSudokuSet();
		return retVal;
	}

	@Override
	public Set<SudokuValue> getRegionValues(int nbr) {
		Set<SudokuValue> retVal = null;
		retVal = this.mapZone.get("region").get(nbr).getSudokuSet();
		return retVal;
	}
	
	@Override
	public int getLineSize() {
		return ligne;
	}

	@Override
	public int getColumnSize() {
		return colonne;
	}

	@Override
	public boolean isValidPosition(int line, int column) {
		return line >= 0 && line < getLineSize() && column >= 0
				&& column < getColumnSize();
	}

	@Override
	public SudokuValue[] getValidValue() {
		return Arrays.copyOf(tabValid, tabValid.length);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(grid);
		result = prime * result + Arrays.hashCode(tabValid);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractSudoku other = (AbstractSudoku) obj;
		if (!Arrays.deepEquals(grid, other.grid))
			return false;
		if (!Arrays.equals(tabValid, other.tabValid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AbstractSudoku [grid=" + Arrays.deepToString(grid) + ", tabValid="
				+ Arrays.toString(tabValid) + "]";
	}

}
