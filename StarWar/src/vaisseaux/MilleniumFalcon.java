package vaisseaux;

public class MilleniumFalcon extends Alliance         //
{

	public void vitesseDeLaLumiere()
	{
		System.out.println("Accrochez-vous !! on fonce a vitesse lumière" );
	}

	//Redéfinition de méthode
	@Override
	public void afficherType() 
	{
		System.out.println("MilleniumFalcon ...");
	}
	
}
