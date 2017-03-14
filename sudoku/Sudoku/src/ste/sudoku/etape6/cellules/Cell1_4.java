package ste.sudoku.etape6.cellules;

import java.util.HashSet;

import ste.sudoku.etape6.cellules.SudokuValue1_4;
import ste.sudoku.etape6.exceptions.DoublonSudokuException;
import ste.sudoku.etape6.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape6.sudokuInterface.Cell;
import ste.sudoku.etape6.sudokuInterface.SudokuValue;
import ste.sudoku.etape6.sudokuInterface.Zone;


public class Cell1_4 implements Cell {
	
	SudokuValue1_4 val;
	private HashSet<Zone> listZones = new HashSet<>();
	private boolean locked=false;
	
	@Override
	public SudokuValue getValue() {
		
		return this.val;
	}
	
//	@Override
//	public void setValue(byte val) throws InvalidSudokuValueException,DoublonSudokuException {
//		try{
//			SudokuValue1_4.valueOf("VAL_"+val);
//		}catch(IllegalArgumentException e){
//			throw new  InvalidSudokuValueException(String.format(
//					"Valeur non valid : %s", val));
//		}
//		setValue(SudokuValue1_4.valueOf("VAL_"+val));
//
//	}
	@Override
	public void setValue(String val) throws InvalidSudokuValueException, DoublonSudokuException {
			try{
				setValue(SudokuValue1_4.valueOf("VAL_"+val));
		}catch(IllegalArgumentException e){
			throw new  InvalidSudokuValueException(String.format(
					"Valeur non valid : %s", val));
		}
			 
	}
	
	@Override
	public void setValue(SudokuValue val) throws InvalidSudokuValueException, DoublonSudokuException {
		if(this.val != val)
		{
			if( val !=null && !(val instanceof SudokuValue1_4 ))throw new InvalidSudokuValueException(String.format(
					"Valeur non valid : %s", val));
			
				if(val == null)
				{
					/*
					 *  Iterator it = set.iterator();
					 *  while(it.hasnext()){
					 *  	SudokuValuev1 a = it.next();
					 *  }
					 */
					for (Zone z : listZones) {
						if(z.contains(this.val))
							z.remove(this.val);
					}
					this.val = null;
				}
				else{
					for (Zone z : listZones) {
						if(z.contains(val)){
							DoublonSudokuException dEx = new DoublonSudokuException(String.format("Valeur en doublon : %s", val)); 
							throw dEx;
						}
					}
					if(this.val != null){
						for (Zone z : listZones) {
							if(z.contains(this.val))
								z.remove(this.val);
						}
					}
					for (Zone z : listZones) {
						z.add(val);
					}
					this.val = (SudokuValue1_4)val;
				}
			
		}

	}

	@Override
	public void addZone(Zone z) {
		listZones.add(z);
	}

	@Override
	public void setLocked() {
		this.locked=true;
	}

}
