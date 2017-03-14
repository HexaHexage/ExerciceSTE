package comptes;

public abstract class Compte 
{
	public String Numero;
	public String Libelle;
	public boolean SubDiv;
	public boolean Supprimer = false;
	
	public boolean supp()
	{
		this.Supprimer = true;
		return this.Supprimer;
	}
	
}
