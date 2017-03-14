package ste.sudoku.etape6.cellules;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import ste.sudoku.etape6.cellules.SudokuValue1_4;
import ste.sudoku.etape6.sudokuInterface.SudokuValue;
import ste.sudoku.etape6.sudokuInterface.Zone;

public class Zone1_4 implements Zone {
	
	//Classe abstraite contenant une série de méthode statiques	
	EnumSet<SudokuValue1_4> set = EnumSet.noneOf(SudokuValue1_4.class);
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
		return set.add((SudokuValue1_4) val);
	}

	@Override
	public boolean remove(SudokuValue val) {
		return set.remove(val);
	}

}
