package be.steformations.pc.contact.jdbc;

import java.util.ArrayList;
import java.util.List;

import be.steformations.java_data.contacts.interfaces.jdbc.ContactJdbcManager;

public class ContactJDBCImpl implements ContactJdbcManager
{
	private String url;
	private String login;
	private String pwd;
	
	public ContactJDBCImpl(String url, String login, String pwd) 
	{
		super();
		this.url = url;
		this.login = login;
		this.pwd = pwd;
	}

	@Override
	public String getEmailByContact(String firstname, String name) 
	{
		String email = null;
		
		if ( firstname != null && name != null ) {
			
			String sql = "SELECT email AS Email "
					+    "FROM contacts "
					+    "WHERE upper(prenom) = upper(?) AND upper(nom) = upper(?)";
			
			// try with resource
			// les objets de type Closeable peuvent être déclarés et instanciés dans les parenthèses
			// du try et leur méthode close() sera automatiquement appelée à la fin du try
			try (
				java.sql.Connection connexion 
					= java.sql.DriverManager.getConnection(this.url, this.login, this.pwd);
				java.sql.PreparedStatement requete = connexion.prepareStatement(sql);
			) {
				requete.setString(1, firstname);
				requete.setString(2, name);
				
				try (
					java.sql.ResultSet resultat = requete.executeQuery();	
				) {
					if ( resultat.next() ) {
						email = resultat.getString("Email");
					}
				}
				
			} catch ( java.sql.SQLException e ) {
				e.printStackTrace();
			}
		}
		
		return email;
	}

	@Override
	public List<String> getEmailsByCountry(String abbreviation) 
	{
		List<String> email = new ArrayList<String>();
		
		if (  abbreviation!= null  ) {
			
			String sql = "SELECT email AS Email "
					+    "FROM contacts JOIN pays ON pays.id = contacts.pays "
					+    "WHERE abreviation = ?";
			
			// try with resource
			// les objets de type Closeable peuvent être déclarés et instanciés dans les parenthèses
			// du try et leur méthode close() sera automatiquement appelée à la fin du try
			try (
				java.sql.Connection connexion 
					= java.sql.DriverManager.getConnection(this.url, this.login, this.pwd);
				java.sql.PreparedStatement requete = connexion.prepareStatement(sql);
			) {
				requete.setString(1, abbreviation);
				//requete.setString(2, name);
				
				try
				(
						java.sql.ResultSet resultat = requete.executeQuery();
				) 
				{
					while ( resultat.next() ) 
					{
						email.add(resultat.getString("Email"));
						
						
					}
				}
				
			} catch ( java.sql.SQLException e )
			{
				e.printStackTrace();
			}
		}
		
		return email;
	}

	@Override
	public List<String> getTagsByContact(String firstname, String name) 
	{
		List<String> tags = new ArrayList<String>();
		
		if ( firstname != null && name != null ) 
		{
			
			String sql = "SELECT  Tags.tag "
					+    "FROM Tags JOIN contacts_tags ON Tags.id = contacts_tags.tag JOIN Contacts ON Contacts_tags.contact = Contacts.id "
					+    "WHERE upper(prenom) = upper(?) AND upper(nom) = upper(?)";
			
			// try with resource
			// les objets de type Closeable peuvent être déclarés et instanciés dans les parenthèses
			// du try et leur méthode close() sera automatiquement appelée à la fin du try
			try (
				java.sql.Connection connexion 
					= java.sql.DriverManager.getConnection(this.url, this.login, this.pwd);
				java.sql.PreparedStatement requete = connexion.prepareStatement(sql);
			) 
			{
				// les ? seront trmplacé ici
				requete.setString(1, firstname);
				requete.setString(2, name);
				
				try
				(
						java.sql.ResultSet resultat = requete.executeQuery();
				) 
				{
					while ( resultat.next() ) // resultat.next = true si il y a un suivant
					{
						tags.add(resultat.getString(1));
						
						
					}
				}
				
			} catch ( java.sql.SQLException e )
			{
				e.printStackTrace();
			}
		}
		
		return tags;
	}

	@Override
	public int createAndSaveContact(String firstname, String name, String email, String countryAbbreviation, String[] tagsValues) 
	{
		String sql = "INSERT INTO contacts(prenom, nom, email, pays) VALUES (?,?,?,?)";
		String sqlid = "SELECT id FROM contacts WHERE prenom =? and nom =?";
		String sqlidpays = "SELECT id FROM pays where pays.abreviation = ?";
		int resultat = 0;
		int resultatid = 0;
		int resultatidpays = 0;
		
		
		
		
		
		if(firstname != null && name != null && email != null)
		{
		//preparation de l objet connexion et requete
		try (
				java.sql.Connection connexion = java.sql.DriverManager.getConnection(this.url, this.login, this.pwd);
				java.sql.PreparedStatement requete = connexion.prepareStatement(sqlidpays);
			) 
			{
			// les ? seront remplacé ici
			
			requete.setString(1, countryAbbreviation);
			java.sql.ResultSet resultatid2 = requete.executeQuery();
			if(resultatid2.next())
				resultatidpays = resultatid2.getInt(1);
			   
			}
		catch ( java.sql.SQLException e )
		{
			e.printStackTrace();
		}
		
		try (
				java.sql.Connection connexion = java.sql.DriverManager.getConnection(this.url, this.login, this.pwd);
				java.sql.PreparedStatement requete = connexion.prepareStatement(sql);
			) 
			{
			// les ? seront trmplacé ici
			requete.setString(1, firstname);
			requete.setString(2, name);
			requete.setString(3, email);
			//remplace le null du string contryabreviation en null integer pour id pays qui est integer
			if(countryAbbreviation == null)
				requete.setNull(4, java.sql.Types.INTEGER);
			else
				requete.setInt(4, resultatidpays);
			
				try
			
				{
					resultat  = requete.executeUpdate();
					
				}
				catch ( java.sql.SQLException e )
				{
					e.printStackTrace();
				}
				if(resultat == 1)
				{
					java.sql.PreparedStatement requeteid = connexion.prepareStatement(sqlid);
					
					requeteid.setString(1, firstname);
					requeteid.setString(2, name);
					
					java.sql.ResultSet resultat2 = requeteid.executeQuery();
					if(resultat2.next())
						resultatid = resultat2.getInt(1);
				}
					
			}
		catch ( java.sql.SQLException e )
		{
			e.printStackTrace();
		}
		
		}
		if(resultat == 1)
			return resultatid;
		else
			return 0;
		
	}

	@Override
	public void removeContact(int id)
	{
		int resultat;
		String sql = "DELETE "
				+    "FROM Contacts "
				+    "WHERE Contacts.id = (?)";
		
		try (
				java.sql.Connection connexion = java.sql.DriverManager.getConnection(this.url, this.login, this.pwd);
				java.sql.PreparedStatement requete = connexion.prepareStatement(sql);
			) 
		{
			requete.setInt(1, id);
			requete.executeUpdate();
		}
		catch ( java.sql.SQLException e )
		{
			e.printStackTrace();
		}
		
	}
	

/*	@Override
	public int createAndSaveContact(String firstname, String name, String email, String countryAbbreviation,
			String[] tagsValues) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeContact(int id) 
	{
		String sql = "REMOVE  Contacts.id, Contacts_tags.id "
				+    "FROM Contacts, Contacts_tags JOIN Contacts_tags ON Contacts_tags.contact = Contacts.id "
				+    "WHERE upper(prenom) = upper(?) AND upper(nom) = upper(?)";
		
		try (
				java.sql.Connection connexion 
					= java.sql.DriverManager.getConnection(this.url, this.login, this.pwd);
				java.sql.PreparedStatement requete = connexion.prepareStatement(sql);
			) 
		{
			
		}

		
	}*/
	
	

	
	
}