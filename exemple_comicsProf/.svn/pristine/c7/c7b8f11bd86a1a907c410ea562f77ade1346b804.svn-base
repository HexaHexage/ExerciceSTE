package be.steformations.java_data.comics.interfaces.jdbc;

import java.sql.Date;
import java.util.List;

public interface ComicsJDBC {

	boolean ping();
	String selectAka(String prenom, String nom);
	String selectGenre( String prenom, String nom );
	List<String> selectPrenoms( String genre );
	int insertPersonnage(String prenom, String nom, String aka, Date ddn);
	void updateAka(String prenom, String nom, String aka);
}
