package main;

import java.util.ArrayList;
import java.util.HashSet;

import comptes.Compte;
import comptes.CompteGeneral;

public class ListeCompteGeneraux 
{
 private ArrayList<CompteGeneral> listCG = new ArrayList<>();


public void add(Compte cpt) 
{
	listCG.add((CompteGeneral) cpt);
}


public ArrayList<CompteGeneral> getList() 
{
	
	return listCG;
}

public boolean exist(String num)
{
	int i=0;
	for(i=0; i<listCG.size() && !listCG.get(i).Numero.equals(num);i++)
	{
		
	}
	
	if(i<listCG.size())
	{
		
		
			System.out.println("le numéro du compte exist deja");
			System.out.println("le numero : " + num + "Libelle: " + listCG.get(i).Libelle);
		
		return true;
	
	}
		else
		return false;
	
	
}

}
