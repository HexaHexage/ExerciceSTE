package StarWar;

import Personnage.Jedi;

public class MainPerso {

	
	public static void main(String[] args) {
		Jedi obiwan = new Jedi("Obiwan Kenobi");
		System.out.println("Personnage crée: "+obiwan.getNom());
		obiwan.utiliserForce();
		
		
		
	}

}
