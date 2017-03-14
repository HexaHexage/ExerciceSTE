package StarWar;

import station.DeathStar;
import vaisseaux.Corelli;
import vaisseaux.MilleniumFalcon;
import vaisseaux.XWing;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MilleniumFalcon f = new MilleniumFalcon();
//		f.decoller();
//		f.afficherType();
		XWing x = new XWing();
//		x.afficherType();
//		x.tirerMissile();
		
		DeathStar d = new DeathStar();
		d.attirerVaisseau(f);
		System.out.println();
		d.attirerVaisseau(x);
		System.out.println();
		Corelli c = new Corelli();
		d.attirerVaisseau(c);
	}

}
