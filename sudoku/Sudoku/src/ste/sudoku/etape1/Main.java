package ste.sudoku.etape1;


public class Main {
	
	/**
	 * Méthode de lancement de l'application Sudoku. 
	 * Teste l'affichage du sudoku et les methodes equals, hashCode et toString
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println("==============================");
		System.out.println();
		scenario1();
		System.out.println("==============================");
		System.out.println();
		scenario2();
		System.out.println("==============================");
		System.out.println();
		scenario3();
		System.out.println("==============================");
	}

	public static void scenario3() {
		System.out.println("Main.scenario3()");
		System.out.println();
		Sudoku sudo1 = new Sudoku();
		sudo1.setValue((byte) 1,0,0);
		sudo1.setValue((byte) 2,1,1);
		sudo1.setValue((byte) 3,2,2);
		sudo1.setValue((byte) 4,3,3);
		sudo1.setValue((byte) 5,4,4);
		sudo1.setValue((byte) 6,5,5);
		System.out.println(sudo1);
	}

	public static void scenario2() {
		System.out.println("Main.scenario2()");
		System.out.println();
		Sudoku sudo1 = new Sudoku();
		sudo1.setValue((byte) 1,0,0);
		sudo1.setValue((byte) 2,1,1);
		sudo1.setValue((byte) 3,2,2);
		sudo1.setValue((byte) 4,3,3);
		sudo1.setValue((byte) 5,4,4);
		sudo1.setValue((byte) 6,5,5);

		Sudoku sudo2 = sudo1;
		System.out.println("sudo1 = sudo2 : "+ sudo1.equals(sudo2));
		System.out.println("sudo1.hashCode() = sudo2.hashCode() : "+(sudo1.hashCode() == sudo2.hashCode()));

		Sudoku sudo3 = new Sudoku();
		System.out.println("sudo1 != sudo3 : "+ ! sudo1.equals(sudo3));
		System.out.println("sudo1.hashCode() != sudo3.hashCode() : "+(sudo1.hashCode() != sudo3.hashCode()));
		
		Sudoku sudo4 = new Sudoku();
		sudo4.setValue((byte) 1,0,0);
		sudo4.setValue((byte) 2,1,1);
		sudo4.setValue((byte) 3,2,2);
		sudo4.setValue((byte) 4,3,3);
		sudo4.setValue((byte) 5,4,4);
		sudo4.setValue((byte) 6,5,5);
		System.out.println("sudo1 = sudo4 : "+ sudo1.equals(sudo4));
		System.out.println("sudo1.hashCode() = sudo4.hashCode() : "+(sudo1.hashCode() == sudo4.hashCode()));
		
		Sudoku sudo5 = new Sudoku();
		sudo5.setValue((byte) 1,0,0);
		sudo5.setValue((byte) 2,1,1);
		sudo5.setValue((byte) 3,2,2);
		sudo5.setValue((byte) 4,3,3);
		sudo5.setValue((byte) 5,4,4);
		sudo5.setValue((byte) 7,5,5);
		System.out.println("sudo1 != sudo5 : "+ !sudo1.equals(sudo5));
		System.out.println("sudo1.hashCode() != sudo5.hashCode() : "+(sudo1.hashCode() != sudo5.hashCode()));
		
		System.out.println("sudo1 != null : "+ !sudo1.equals(null));
	}

	public static void scenario1() {
		System.out.println("Main.scenario1()");
		System.out.println();
		Sudoku sudo = new Sudoku();
		Ecran ecran = new Ecran();
		sudo.setValue((byte) 1,0,0);
		sudo.setValue((byte) 2,1,1);
		sudo.setValue((byte) 3,2,2);
		sudo.setValue((byte) 4,3,3);
		sudo.setValue((byte) 5,4,4);
		sudo.setValue((byte) 6,5,5);
		ecran.afficheTitre();
		ecran.afficheSudoku(sudo);
	}

}
