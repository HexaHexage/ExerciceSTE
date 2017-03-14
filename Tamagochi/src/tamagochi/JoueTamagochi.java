package tamagochi;

import java.util.Random;
import java.util.Scanner;

public class JoueTamagochi {

	public static void main(String[] args) 
	{
		int nbTama=0;
		int nbAliment=0;
		boolean quit = false;
		int i;
		int quiNourir;
		int quoiNourir;
		int mort=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de Tamagochi voulez vous elever");
	    nbTama = sc.nextInt();
	
	    Tamagochi[] tabTama;
	    tabTama = new Tamagochi[nbTama];
	    
	    
	    
	    if(sc.hasNextLine())					// nettoie buffer affichage
	    		{
	    			sc.nextLine();
	    		}
	    
	    for(i=0;i<nbTama;i++)                   // remplir tableau tama
	    {
	    	System.out.println("Entrez le nom du Tamagochi n° "+ (i+1));
	    	tabTama[i]= new Tamagochi(sc.nextLine());
	    	
	    }
	    
	    System.out.println("Combien d aliment voulez vous pourvoir donner");
	    nbAliment = sc.nextInt();
	
	    Aliment[] tabAliment;
	    tabAliment = new Aliment[nbAliment];
	    
	    if(sc.hasNextLine())						//nettoie buffer affichage
		{
			sc.nextLine();
			
		}
	    
	    for(i=0;i<nbAliment;i++)                   // remplir tableau aliment
	    {
	    	System.out.println("Entrez le nom de l aliment n° "+ (i+1));
	    	tabAliment[i] = new Aliment(sc.nextLine(), new Random().nextInt(3) + 1);
	    	
	    }
	    
	    
	    
	    
	    while (quit == false)
	    {
	    	 for(i=0;i<nbTama;i++)
	    	 {
	    		 
	    		 if (tabTama[i].dureeVie > tabTama[i].age)   //feter anniversaire
	    			 tabTama[i].age++;
	    		 
	    		 
	    	 }
	    	 
	    	
	    	System.out.println("Quelle Tamagochi voulez vous nourrir");
	    	for (int j = 0; j < tabTama.length; j++) 
	    	{
			   if(!tabTama[j].estAuParadis())
			   {   
	    		System.out.println(j + " " + tabTama[j].nom);
	    		
			   }
			}
	    	quiNourir = sc.nextInt();
	    	
	    	System.out.println("Quelle aliment voulez vous donner");
	    	for (int j = 0; j < tabAliment.length; j++) 
	    	{
			  
	    		System.out.println(j + " " + tabAliment[j].getnom());
	    		
			  
			}
	    	quoiNourir = sc.nextInt();
	    	
	    	
	    	if(quiNourir <= nbTama && tabTama[quiNourir].energie < tabTama[quiNourir].maxEnergie)
			{
				tabTama[quiNourir].nourrir(tabAliment[quoiNourir]);
			}
	    	 
	    	for (int j2 = 0; j2 < tabAliment.length; j2++) 
	    	{
				tabTama[j2].parler();						// faire parler
			}
			
	    	System.out.println("Quelle Tamagochi voulez vous nourrir");
	    	for (int j = 0; j < tabTama.length; j++) 
	    	{
			   if(!tabTama[j].estAuParadis())
			   {   
	    		System.out.println(j + " " + tabTama[j].nom);
	    		
			   }
			}
	    	quiNourir = sc.nextInt();
	    	
	    	System.out.println("Quelle aliment voulez vous donner");
	    	for (int j = 0; j < tabAliment.length; j++) 
	    	{
			  
	    		System.out.println(j + " " + tabAliment[j].getnom());
	    		
			  
			}
	    	quoiNourir = sc.nextInt();
	    	
	    	
	    	if(quiNourir <= nbTama && tabTama[quiNourir].energie < tabTama[quiNourir].maxEnergie)
			{
				tabTama[quiNourir].nourrir(tabAliment[quoiNourir]);
			}	 
	    		 
	    	mort = 0;
	    	for(i=0;i<nbTama;i++)
	    	 {
	    		 
	    		 if (tabTama[i].estMortDeFaim())
	    		 {
	    			quit = true; 
	    		 }
	    		 else if(tabTama[i].estAuParadis())	
	    			 mort++;
	    		 
	    		 
	    	 }
	    if(mort == nbTama)
	    	quit = true;
	    }
	    
	    
	 if (mort == nbTama) 
		 System.out.println("gagné");  
	 else
		 System.out.println("Perdu+");
	
	}

}
