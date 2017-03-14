package menu;

import java.util.Scanner;
import java.util.Vector;

public class Menu 
{
		private Vector<MenuItem> menu;
		private String quit;

		public Menu()
		{
			menu = new Vector<MenuItem>();
			this.setQuit("Quitter");
		}

		public void addMenu(MenuItem item)
		{
			menu.addElement(item);
		}

		public void removeMenu(MenuItem item)
		{
			menu.removeElement(item);
			
		}

		public void start() 
		{
			Scanner s = new Scanner(System.in);
			Boolean fin = false;
			int resp = 0;
			do 
			{
				System.out.println();
				for (int i = 0; i < menu.size(); i++)
				{
					System.out.println((i + 1) + ". " + menu.elementAt(i).getLabel());
				}
				System.out.print((menu.size() + 1) + ". " + quit + "\n\nVotre Choix : ");
				resp = s.nextInt();
				System.out.print("\n\n\n\n\n\n\n");

				if (resp > 0 && resp <= menu.size()) 
				{
					menu.get(resp - 1).getAction().MenuActionPerformed();
				} 
				else 
					if (resp == menu.size() + 1) 
					{
					fin = true;
					} 
					else 
					{
						System.out.println("Entrer une valeur correcte");
					}

			} while (!fin);
			// s.close();
			s = null;
		}

		public String getQuit()
		{
			return quit;
		}

		public void setQuit(String quit)
		{
			this.quit = quit;
		}

	}


