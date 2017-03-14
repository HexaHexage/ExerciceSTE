package ste.sudoku.etape6;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import ste.sudoku.etape6.sudokuInterface.Sudoku;

public class FileReaderV1 {
	
	private final String fileName;
	private Sudoku sudoku;
	
	public FileReaderV1(String fileName, Sudoku sudoku) {
		super();
		this.fileName = fileName;
		this.sudoku = sudoku;
	}
	

	public void read()  {
		int lig = 0;
		
		String[] tabVal; 
//        File file = new File("ressources/"+this.fileName+".txt");
        Path file = Paths.get("ressources", this.fileName+".txt");
       
        Scanner in;
//		try {
//			in = new Scanner(file,"UTF-8");
//		
//	        in.nextLine();
//	        in.nextLine();
//	        while (in.hasNextLine())
//	        {
//	        			
//	             		tabVal = in.nextLine().split(" ");
//	            		for(int j = 0;j<tabVal.length;j++)
//	            		{
//	            			if(!tabVal[j].equals("0"))
//	            				sudoku.getCell(lig, j).setValue(Byte.valueOf(tabVal[j]));;
//	            		}
//	            		lig++;
//	
//	        		
//	        }
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//            sudoku.lock();
		
        try {
			in = new Scanner(file,"UTF-8");
		
	        in.nextLine();
	        in.nextLine();
	        
	        while (in.hasNext())
	        {
	        	for(int j = 0;j<sudoku.getColumnSize();){
	        		String val = in.next();
	        		if(sudoku.isValidPosition(lig, j)){
            			if(!val.equals("0")){
            				sudoku.getCell(lig, j).setValue(val);
            			}
            			j++;
            		}
	        	}
	        	lig++;
	        		
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
	}

}
