package ClassExemple;

public class Stagiaire 
{
	private String prenom;
	private String nom;
	
	public Stagiaire(String prenom, String nom)
	{
		//this.prenom=prenom;
		setPrenom(prenom);
		this.nom=nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	public void setPrenom(String prenom)
	{
		this.prenom=prenom;
		
	}
	public String getnom()
	{
		return this.nom;
	}
	public void setNom(String nom)
	{
		this.prenom=nom;
		
	}
}
