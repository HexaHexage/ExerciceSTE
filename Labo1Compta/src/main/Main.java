package main;



import menu.Menu;
import menu.MenuItem;
import java.util.Scanner;
import comptes.GeneralNonSubdivisable;
import comptes.Compte;
import comptes.CompteGeneral;
import comptes.CompteParticulier;


public class Main
{

	public static void main(String[] args)
	
	
	{
		
		    ListeCompteGeneraux List = new ListeCompteGeneraux();
		
			Menu menuGeneralCreer = new Menu();
			menuGeneralCreer.addMenu(new MenuItem("Non subdivisible", ()->
			{
				System.out.println("Entrer le numéro du compte");
				Scanner sc = new Scanner(System.in);
				String num = sc.nextLine();
				
				
					
				
				System.out.println("Entrer le nom du compte");
				String libelle = sc.nextLine();
				
				if (!List.exist(num) && libelle != null && num.length() == 6)  // si le numero n existe pas que le libelle n est pas null et que la taille de num est de 6 alors on le cree
					List.add(creerCGNS(num, libelle));
				
				
				
				
				
			}));
			menuGeneralCreer.addMenu(new MenuItem("Subdivisible par compte general", ()->
			{
				System.out.println("Entrer le numéro du compte");
				Scanner sc = new Scanner(System.in);
				String num = sc.nextLine();
				
				System.out.println("Entrer le nom du compte");
				String libelle = sc.nextLine();
				
				
				List.add(creerCGS(num, libelle));
				
			}));
			menuGeneralCreer.addMenu(new MenuItem("Subdivisible par compte particulier", ()->{}));
			
		
			Menu menuComptaOperationsComptable = new Menu();
			menuComptaOperationsComptable.addMenu(new MenuItem("Creer ecriture comptable", ()->{}));
			menuComptaOperationsComptable.addMenu(new MenuItem("Modifier ecriture comptable", ()->{}));
			menuComptaOperationsComptable.addMenu(new MenuItem("Supprimer ecriture comptable", ()->{}));
			menuComptaOperationsComptable.addMenu(new MenuItem("Afficher toutes les operations d'un compte et son solde", ()->{}));
			menuComptaOperationsComptable.addMenu(new MenuItem("Afficher Bilan", ()->{}));
			
			
			Menu menuComptaGeneral = new Menu();
			menuComptaGeneral.addMenu(new MenuItem("Creer", ()->menuGeneralCreer.start()));
			menuComptaGeneral.addMenu(new MenuItem("Modifier", ()->{}));
			menuComptaGeneral.addMenu(new MenuItem("Supprimer", ()->
			{
				
				System.out.println("Entrer le numéro du compte a supprimer");
				Scanner sc = new Scanner(System.in);
				String num = sc.nextLine();
				
				for (int i = 0;i<List.getList().size();i++)
				{
					
					if (List.getList().get(i).Numero.equals(num))
						List.getList().get(i).supp();
						
					
					
				}
			}));
			menuComptaGeneral.addMenu(new MenuItem("Lister", ()->
			{
				
				System.out.println("Liste des compte generaux");
				for (int i = 0;i<List.getList().size();i++)
				{
					if(!List.getList().get(i).Supprimer && List.getList().get(i).Numero.length() < 7)
					{
					 System.out.println(List.getList().get(i).Libelle);
					 System.out.println(List.getList().get(i).Numero);
					 System.out.println(List.getList().get(i).SubDiv);
					 System.out.println(List.getList().get(i).PosBil);
					 //System.out.println(List.getList().get(i).Supprimer);
					}
					
				}
					
				
				
			}));
			
			Menu menuComptaParticulier = new Menu();
			menuComptaParticulier.addMenu(new MenuItem("Creer", ()->
			{
				System.out.println("Entrer le numéro du compte");
				Scanner sc = new Scanner(System.in);
				String num = sc.nextLine();
				/*
				if(List.exist(num))
				{
					System.out.println("le numéro du compte exist deja");
					System.out.println("le numero : " + num + "Libelle: " + List.getList().libelle);
				}
					
				*/
				System.out.println("Entrer le nom du compte");
				String libelle = sc.nextLine();
				
				if (!List.exist(num) && libelle != null && num.length() == 10)  // si le numero n existe pas que le libelle n est pas null et que la taille de num est de 6 alors on le cree
					List.add(creerCGNS(num, libelle));
				else
					System.out.println("le numéro du compte exist deja ou est incorrect... ou libelle est vide ");
			}));
			
			menuComptaParticulier.addMenu(new MenuItem("Modifier", ()->{}));
			menuComptaParticulier.addMenu(new MenuItem("Supprimer", ()->
			{
				System.out.println("Entrer le numéro du compte a supprimer");
				Scanner sc = new Scanner(System.in);
				String num = sc.nextLine();
				
				for (int i = 0;i<List.getList().size();i++)
				{
					
					if (List.getList().get(i).Numero.equals(num))
						List.getList().get(i).supp();
						
					
					
				}
			}));
			menuComptaParticulier.addMenu(new MenuItem("Lister", ()->
			{
				System.out.println("Liste des compte Particulier");
				for (int i = 0;i<List.getList().size();i++)
				{
					if(!List.getList().get(i).Supprimer && List.getList().get(i).Numero.length() > 6)
					{
					 System.out.println(List.getList().get(i).Libelle);
					 System.out.println(List.getList().get(i).Numero);
					 System.out.println(List.getList().get(i).SubDiv);
					 System.out.println(List.getList().get(i).PosBil);
					}
					
				}
			}));
			
			Menu menuCompta = new Menu();
			menuCompta.addMenu(new MenuItem("Compte General", ()->menuComptaGeneral.start()));
			menuCompta.addMenu(new MenuItem("Compte Particulier", ()->menuComptaParticulier.start()));
			menuCompta.addMenu(new MenuItem("Operations Comptable", ()->menuComptaOperationsComptable.start()));
			menuCompta.start();

	

	}
	
	
	public static Compte creerCGNS(String num, String nom)
	{
		Compte cpt = new GeneralNonSubdivisable(num, nom);
		
		return(cpt);
		
		
		
		
	
		
	}
	public static Compte creerCGS(String num, String nom)
	{
		Compte cpt = new GeneralNonSubdivisable(num, nom);
		
		return(cpt);
		
		
		
		
	}
	
	

}