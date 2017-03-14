package Personnage;

public  class Jedi extends Rebelle implements Force
{

	public Jedi(String nom)
	{
		super(nom);
		System.out.println("Je construis un Jedi");
		
	}

	public void utiliserForce() {
	
		System.out.println("Je combats le mal .... " +
				"avec le côté lumineux de la force :)");
	}
}
