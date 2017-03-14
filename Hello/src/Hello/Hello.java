package hello;
import java.util.Date;
import java.util.Scanner;

class Hello
{
   public static void main(String [] args)               // public -> pour tous //void -> ne renvois rien
   {
	String maChaine = "Les open source"; 
	byte nb = 55, nb2 = 10; 
	byte nb3 = (byte) (nb + nb2); // casting pour forcer les 
	int nb4 = 100 * nb3;
	char c = 'c';
	String maChaine2 = "";

 	System.out.println(maChaine);
	System.out.println("coucou2 "+ maChaine +" " +nb3);  // affiche tout
	Date d = new Date(); // faut le package date
	if (nb==55) {System.out.println(d);} // affiche d qui vaut date machine
	if (nb>=55) {System.out.println(d);} 
	
	while(!maChaine2.equals("oui"))
	{
	System.out.println("ca va?");	
	Scanner sc = new Scanner(System.in);  // cree outils de lecture
	maChaine2 = sc.nextLine();	      // insert dans la chaine via l outil
	}

	nb = 0;
	while(nb<=10)		//11x car nb = 0 jusque 10
	{
	System.out.println(nb);
	nb++;
	}
	for(nb=0;nb<10;nb++)
	{
	System.out.println(nb);  // affiche 0->9
	}
	for(nb=1;nb<=10;nb++)
		System.out.println(nb);  // affiche 1->10
	switch(nb)
	{
	case 0 :
	System.out.println(nb);
	break;
	case 11:
	System.out.println(nb);          
	break;
	}
	

	direBonjour();                        // appel de la methode 
	
	String s = "Bonjour Hexa ici la Methode afficher avec parametre";
	
	afficher (s,nb);

	String chaine = demanderChaine();
	
	System.out.println(chaine);

	int[] tab = {4,5,6,7};
	System.out.println(" taille TAB = " +tab.length);

   }

	public static void direBonjour()			// methode direBonjour
	{
	System.out.println("Bonjour Hexa ici la Methode direBonjour");
	} 
			
	public static void afficher(String s, int nb)			// methode avec argument
	{
	for(int i =0;i<nb;i++)						// i est cree sur le for et disparait apres
	System.out.println(s);
	
	}	

	public static String demanderChaine()

	{
	Scanner sc = new Scanner(System.in);				// cree un scanner
	System.out.println("Entrez une chaine");			// affiche 
	return sc.nextLine();						// retourne sc.nextLine
	}
}
