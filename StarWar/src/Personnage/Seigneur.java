package Personnage;

public  class Seigneur extends Serviteur  implements Force{
	
	public Seigneur(String nom)
	{
		super(nom);
	}

	public void utiliserForce()
	{
		System.out.println("La force est noire ...");
		
	}
}
