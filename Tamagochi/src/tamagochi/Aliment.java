package tamagochi;

public class Aliment 
{
  private String nom;
  private int valeurEnergetique;
  
  
  public Aliment(String nom, int valEnergetique)
	{
			
		this.nom=nom;
		this.valeurEnergetique= valEnergetique;
		
	}
  
  public String getnom()
	{
		return this.nom;
	}
	public void setNom(String nom)
	{
		this.nom=nom;
		
	}
	public int getvaleurEnergetique()
	{
		return this.valeurEnergetique;
	}
	public void setvaleurEnergetique(int valeur)
	{
		this.valeurEnergetique= valeur;
		
	}
	
}
