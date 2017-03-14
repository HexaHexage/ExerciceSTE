package exempleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exempleExecption {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nb = 0, nb2=100;
		boolean ok = false;
		while(!ok){
			System.out.println("Veuillez entrez un nombre");
			String s = sc.nextLine();
			try{
				nb = Integer.parseInt(s);
				System.out.println("Bravo tu as réussi ! ");
				nb = nb2/nb;
				ok=true;
			}catch (NumberFormatException /* | ArithmeticException*/ e) {
				System.out.println("Attention "+s+" n'est pas un nombre");
			}catch (ArithmeticException e) {
				System.out.println("t'es fou diviser par zéro ?!");
			}finally{
				if(nb==0)System.out.println("tu n'es pas doué ...");
			}
		}
		
		try {
			int nbBis = demanderNombre(sc, 1, 100);
		} catch (WrongNumberException e) {
			System.out.println("message "+e.getMessage());
			System.out.println();
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static int demanderNombre(Scanner sc, int limite1, int limite2) 
			throws WrongNumberException
	{
		System.out.println("Veuillez entrer un nombre entre "+limite1+" et "+limite2);
		int nb = 0;
		try{
			 nb = sc.nextInt();
			if(nb<limite1 || nb>limite2)
				throw new WrongNumberException("Hors limite ("+limite1+","+limite2+")");
		}catch (InputMismatchException e) {
			throw new WrongNumberException(e);
		}
		
		return nb;
	}
	
	
	
}