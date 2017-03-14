package comptes;

public  class GeneralNonSubdivisable extends CompteGeneral
{
	public GeneralNonSubdivisable(String num , String libelle) 
	{
		this.SubDiv = false;
		this.Libelle = libelle;
		this.Numero = num;
	}
	
	
		
	public String getLibelle()
	{
		return this.Libelle;
	}
	public void setLibelle(String libelle)
	{
		this.Libelle = libelle;
		
	}
	public String getNumero()
	{
		return this.Numero;
	}
	public void setNom(String numero)
	{
		this.Numero = numero;
		
	}
	
}
