package ste.sudoku.etape6.cellules;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import ste.sudoku.etape6.cellules.SudokuValue1_9;
import ste.sudoku.etape6.sudokuInterface.SudokuValue;
import ste.sudoku.etape6.sudokuInterface.Zone;

public class Zone1_9 implements Zone {
	
	//EnumSet : Classe abstraite contenant une série de méthode statiques		
	EnumSet<SudokuValue1_9> set = EnumSet.noneOf(SudokuValue1_9.class);
	
	
	
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
		return set.add((SudokuValue1_9) val);
	}

	@Override
	public boolean remove(SudokuValue val) {
		return set.remove(val);
	}

}
