package ste.sudoku.etape6Bis.cellules;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import ste.sudoku.etape6Bis.sudokuInterface.SudokuValue;
import ste.sudoku.etape6Bis.sudokuInterface.Zone;

public class ZoneImpl implements Zone {
	
//	private Class<? extends Enum> enumClass;
	Set<SudokuValue> set = new HashSet<>();
	//<? extends SudokuValue>  add(Sudokuvalue v) le compilateur n'accepte pas
//	public ZoneImpl(Class<? extends Enum> enumClass){
//		this.enumClass=enumClass;
//	}
	
	@Override
	public Set<SudokuValue> getSudokuSet() {
		return Collections.unmodifiableSet((Set<? extends SudokuValue>)set);
	}

	@Override
	public boolean contains(SudokuValue val) {
		return set.contains(val);
	}

	@Override
	public boolean add(SudokuValue val) {
		return set.add(val);
	}
	
	
	@Override
	public boolean remove(SudokuValue val) {
		return set.remove(val);
	}
}
