package be.steformations.java_data.comics.tests.jdbc;

import be.steformations.java_data.comics.interfaces.jdbc.ComicsJDBC;
import be.steformations.pc.comics.jdbc.ComicsJDBCImpl;

public class FabriqueComicsJDBC
{

	public static ComicsJDBC getComicsJDBC() 
	{
		String login = "postgres";
		String pwd = "postgres";
		String url = "jdbc:postgresql://localhost:5432/comics";
		
		//login ="root";
		//pwd = "mysql";
		//url = "jdbc:mysql://localhost:3306/comics";
		
		return new ComicsJDBCImpl(url, login, pwd);
	}
}
