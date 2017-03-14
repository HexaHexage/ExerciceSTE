package ExempleEnum;

public class Main {

	public static void main(String[] args) 
	{
		Film f = new Film("Inglorius Bastard", Genre.COMEDIE);
		System.out.println("mon film est"+f.getTitre()+ "et son genre est"+f.getGenre());
		
	}

}
