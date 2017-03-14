package tamagochi;

import java.util.Random;

public class Tamagochi 
{
	int age;
	int dureeVie;
	int maxEnergie;
	int energie;
	public String nom; 
	
	public Tamagochi(String nom)
	{
		
		this.nom=nom;
		this.dureeVie = new Random().nextInt(5)+3;
		this.maxEnergie = new Random().nextInt(6)+5;
		this.energie = new Random().nextInt(this.maxEnergie - 2)+3;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	//public void setNom(String nom)
	//{
	//	this.nom=nom;
	//}
	public void parler()
	{
		if (this.energie < 3)
		 System.out.println("Meurs de faim");
		if (this.energie >= 3 && this.energie <5)
			 System.out.println("Content");
		if (this.energie >= 5)
			 System.out.println("Super heureux");
		reduitEnergie();
		
		
	}
	private void reduitEnergie()
	{
		this.energie--;
		if (this.energie == 0)
			System.out.println("le tamagotchi est mort de faim");
			
	}
	public void nourrir(Aliment aliment)
	{
		this.energie = this.energie + aliment.getvaleurEnergetique();
		 if (this.energie > this.maxEnergie)
		 {
			 System.out.println("a trop mangé ! ");
			
		 }
		 else
		 {
			 System.out.println("Merci pour "+ aliment.getnom());
		 }
	}
	void feterAnniversaire()
	{
		this.age++;
		if (this.dureeVie >= this.age)
			System.out.println("monte au paradis");
		else
			System.out.println(this.getNom() + "monte au paradis");
	
		reduitEnergie();
	}
	public boolean estAuParadis()
	{
		return this.age>=this.dureeVie;
	}
	public boolean estMortDeFaim()
	{
		return this.energie==0;
	}
}
