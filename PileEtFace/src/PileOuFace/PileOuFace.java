package PileOuFace;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author HexaHexage
 *
 */
public class PileOuFace {

	public static void main(String[] args) 
	{
	 int tirage = 0, choixMenu=5, pile=0, face=0, choixUtilisateur, tentative = 0, gagne=0, perdu=0 ;
	 
	 System.out.println("Tapez 1 : Pour Réinitialiser les statistiques ");
	 System.out.println("Tapez 2 : Pour Jouer ");
	 System.out.println("Tapez 3 : Pour 3 Afficher les statistiques ");
	 System.out.println("Tapez 4 : Pour Quitter le programme");
	 
	 Scanner sc = new Scanner(System.in);				// cree un scanner
	 System.out.println("Entrez votre choix");			// affiche 
     choixMenu = sc.nextInt();
	 
	 while(choixMenu< 4 && choixMenu > 0)
	 {
		if (choixMenu == 1)
		{
		 pile=0;face=0;tentative=0;gagne=0;perdu=0;
		}
		if (choixMenu == 2)
		{
			System.out.println("Tapez 1 pour Pile et 2 pour face : Entrez votre choix");			// affiche 
		    choixUtilisateur = sc.nextInt();
			tirage = lance();
			if (tirage == 1)
			{
			
			System.out.println("Pile");
			pile++;
			}
			else
			{	
			System.out.println("Face");	
			face++;
			}
			tentative++;
			if (tirage == choixUtilisateur)
			{
			System.out.println("Gagné");
			gagne++;
			}
			else
			{
			System.out.println("Perdu");
			perdu++;
			}
		 }
		if (choixMenu == 3 )
		{
			if (tentative > 1)
			{
				System.out.println("Voici les statistiques:");
				System.out.println("Nombre de tirage: " + tirage);
				System.out.println("Nombres de fois pile: " + pile);
				System.out.println("Nombres de fois face: " + face);
				System.out.println("Vous avez gagné: " + gagne + " fois");
				System.out.println("Vous avez perdu: " + perdu + " fois");
			} 
			else
			{
				System.out.println("Il faut jouer au moins une partie avec de reset les statistiques...");
			}
			
		}
		for(int i = 0; i < 2; i++)
		{
		    System.out.println("");
		}
		System.out.println("Tapez 1 : Pour Réinitialiser les statistiques ");
		System.out.println("Tapez 2 : Pour Jouer ");
		System.out.println("Tapez 3 : Pour 3 Afficher les statistiques ");
		System.out.println("Tapez 4 : Pour Quitter le programme");
		 
		System.out.println("Entrez votre choix");			// affiche 
        choixMenu = sc.nextInt();
		 
		 
	 }
	 System.out.println("Aurevoir");
		
	}

	public static int lance()
	{
	 int tirage;
	 tirage = new Random().nextInt(2)+1;
	 return tirage;
	}
	
}
