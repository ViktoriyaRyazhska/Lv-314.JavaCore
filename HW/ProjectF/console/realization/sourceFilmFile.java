package console.realization;

import java.util.ArrayList;
import java.util.List;

public class sourceFilmFile {
public static List<Film> film=new ArrayList<>();

public static void showInfo() {
	List <String> nameactors= new ArrayList<>();
	List <String> genre= new ArrayList<>();
	List <String> studio= new ArrayList<>();
	List <String> director= new ArrayList<>();
	String desriprion="This is test";
	nameactors.add("Brad");
	nameactors.add("samson");
	nameactors.add("Olec");
	genre.add("comedy");
	genre.add("fantastic");
	genre.add("horror");
	studio.add("warner brosers");
	director.add("Eshton Filcher");
	film.add(new Film("Fight Club",5.3f,nameactors,genre,director,studio,desriprion));
	
	film.forEach(System.out::println);
}
}
