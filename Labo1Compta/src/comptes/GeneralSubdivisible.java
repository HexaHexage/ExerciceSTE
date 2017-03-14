package comptes;

public  class GeneralSubdivisible extends CompteGeneral
{
	public void GeneralSubdivisable(String num , String libelle) 
	{
		this.SubDiv = true;
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
