package ste.heritage;

import vaisseaux.Alliance;

public class XWing extends Alliance {

	public XWing(){
		//implicite
		//super();
		super.nbMissiles=10;
	}

	@Override
	public void afficherType() {
		System.out.println("XWing");
	}
	
	
}
