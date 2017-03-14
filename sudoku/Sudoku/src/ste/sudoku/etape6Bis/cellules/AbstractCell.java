package ste.sudoku.etape6Bis.cellules;

import java.util.HashSet;

import ste.sudoku.etape6Bis.exceptions.DoublonSudokuException;
import ste.sudoku.etape6Bis.exceptions.InvalidSudokuValueException;
import ste.sudoku.etape6Bis.exceptions.LockedCellException;
import ste.sudoku.etape6Bis.sudokuInterface.Cell;
import ste.sudoku.etape6Bis.sudokuInterface.SudokuValue;
import ste.sudoku.etape6Bis.sudokuInterface.Zone;

public abstract class  AbstractCell implements Cell{
	
	private Class<? extends Enum> enumClass;
	private SudokuValue val;
	private HashSet<Zone> listZones = new HashSet<>();
	private boolean locked=false;
	
	public AbstractCell(Class<? extends Enum> enumClass){
		this.enumClass=enumClass;
	}
	
	@Override
	public SudokuValue getValue() {
		return this.val;
	}

	@Override
	public void setValue(String val) throws InvalidSudokuValueException, DoublonSudokuException, LockedCellException {
		
		try{
			setValue( (SudokuValue)Enum.valueOf(enumClass, "VAL_"+val));
		}catch(IllegalArgumentException e){
			throw new  InvalidSudokuValueException(String.format(
					"Valeur non valid : %s", val),e);
		}
		
	}

//	@Override
//	public void setValue(SudokuValue val) throws InvalidSudokuValueException {
//		if(!(val.getClass()==enumClass))throw new InvalidSudokuValueException(String.format(
//				"Valeur non valid : %s", val));
//		this.val=val;
//		
//	}
	@Override
	public void setValue(SudokuValue val) throws InvalidSudokuValueException, DoublonSudokuException, LockedCellException {
		
		
		if(locked)throw new LockedCellException();
		
		if(this.val != val)
		{
			
			if( val !=null && !(val.getClass()!=enumClass))throw new InvalidSudokuValueException(String.format(
					"Valeur non valid : %s", val));
			
				if(val == null)
				{
					
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
					this.val = val;
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
