package vaisseaux;

public abstract class Vaisseau
{
	
	protected int nbMissiles;
	
	public void tirerMissile()
	{
		System.out.println("Je tire 1 missile");
		nbMissiles--;
		System.out.println("Missiles restant "+nbMissiles);
	}
	
	public void decoller()
	{
		System.out.println("Je décolle !! bougez vous");
	}
	
	public abstract void afficherType();
	
	
}
