package Personnage;

public abstract class Personnage {
	
	private String nom;
	
	//public abstract void afficherCamp();
	
	public Personnage(String a)
	{
		nom=a;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public abstract void afficherCamp();
	
	public void presentation()
	{
		System.out.println("je suis " + this.nom);
	}
}
