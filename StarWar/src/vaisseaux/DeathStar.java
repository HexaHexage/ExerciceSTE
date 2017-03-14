package vaisseaux;

import vaisseaux.Alliance;
import vaisseaux.Vaisseau;
import vaisseaux.XWing;

public class DeathStar
{
	
	public void attirerVaisseau(Vaisseau v)
	{
		
		System.out.print("Vaisseau attiré : ");
		v.afficherType();
		
	}
	//Overloading / Surcharge de méthodes
	public void attirerVaisseau(XWing x){
		System.out.print("Vaisseau impérial : ");
		x.afficherType();
		x.confirmerOrdre();
	}
	
	public void attirerVaisseau(Alliance a){
		System.out.println("Vaisseau rebelle capturé :");
		a.afficherType();
		a.appelerObiwan();
	}
}
