package console.realization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Film {
	private float general_Point = 0;
	private float IMDB = 1;
	private String name_of_Film;
	private List<String> actors=new ArrayList<String>(); // its contains actors of film witch user selected
	private List<String> genres;
	private List<String> directors;
	private List<String> studious;
	private String description;

	public Film(String name_of_Film,float iMDB, List<String> actors, List<String> genres, List<String> directors, List<String> studious,
			String description) {
		super();
		IMDB = iMDB;
		this.actors = actors;
		this.genres = genres;
		this.directors = directors;
		this.studious = studious;
		this.description = description;
		this.name_of_Film=name_of_Film;
	}

	public static void startCompare(List<Film> user_film, List<Film> sourse_film) {
	//	setDependencies(user);
		for (int i = 0; i < user_film.size(); i++) {
			for (int j = 0; j < sourse_film.size(); j++) {
				calcActorPoint(user_film.get(i), sourse_film.get(j));
				calcDirectorPoint(user_film.get(i), sourse_film.get(j));
				calcGenrePoint(user_film.get(i), sourse_film.get(j));
				calcStudioPoint(user_film.get(i), sourse_film.get(j));
				calcRDF(user_film.get(i), sourse_film.get(j));
			}
		}
		for(int i=0;i<sourse_film.size();i++)
			addImdbPoint(sourse_film.get(i));
		
		
	}

	// its example , if we need we can add very most dependencies like a director or
	// some an actors
/*	public   void setDependencies(User data) {
		if (data.getAge() < 12) {
			genres.add("family film");
			genres.add("fantasy");
			genres.add("cartoon");
		} else if (data.getAge() < 12 && data.getAge() > 18) {
			genres.add("fantasy");
			genres.add("serial");
			genres.add("Comedy");
		} else if (data.getAge() < 18 && data.getAge() > 25) {
			genres.add("Comedy");
			genres.add("Action");
			genres.add("Adventure");
		} else {
			genres.add("Biographical");
			genres.add("Documentary");
			genres.add("Historical");
		}
		if (data.isSex()) {
			genres.add("Crime & Gangster Films");
			genres.add("Horror");
			genres.add("War");
			genres.add("Westerns");
			genres.add("Superhero");
		} else {
			genres.add("Melodramas");
			genres.add("Epics");
			genres.add("Drama");
			genres.add("Adventure");
			genres.add("Romance");
		}
	}*/

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getActors() {
		return actors;
	}

	public float getIMDB() {
		return IMDB;
	}

	public void setIMDB(float iMDB) {
		this.IMDB = iMDB;
	}

	public void setActors(String name_actors) {
		this.actors.add(name_actors);
	}

	public float getGeneral_Point() {
		return general_Point;
	}

	/* This method find same actors in two films */
	public static void calcActorPoint(Film user_film, Film next_film) {
		for (String actors_User : user_film.actors) {
			for (String actors_next : next_film.actors) {
				if (actors_User.equals(actors_next)) {
					next_film.general_Point += 0.5;
				}
			}
		}
	}

	public static void addImdbPoint(Film next_film) {
		next_film.general_Point += next_film.IMDB;
	}

	public static void calcGenrePoint(Film user_film, Film next_film) {
		for (String genres_User : user_film.genres) {
			for (String genres_next : next_film.genres) {
				if (genres_User.equals(genres_next)) {
					next_film.general_Point++;
				}
			}
		}
	}

	public static void calcDirectorPoint(Film user_film, Film next_film) {
		for (String director_User : user_film.directors) {
			for (String director_next : next_film.directors) {
				if (director_User.equals(director_next)) {
					next_film.general_Point++;
				}
			}
		}

	}

	public static void calcStudioPoint(Film user_film, Film next_film) {
		for (String studio_User : user_film.studious) {
			for (String studio_next : next_film.studious) {
				if (studio_User.equals(studio_next)) {
					next_film.general_Point++;
				}
			}
		}
	}

	public static int calcRDF(Film user_film, Film next_film) {// relevance description films
		int count_same_words = 0;
		for (Map.Entry<String, Integer> step_user : user_film.frequencyWords().entrySet())
			for (Map.Entry<String, Integer> step_next : next_film.frequencyWords().entrySet())
				if (step_user.getKey().equals(step_next.getKey()))
					count_same_words++;
		System.out.println(user_film.frequencyWords());
		System.out.println(next_film.frequencyWords());
		return count_same_words * 2;
	}

	// Finds frequency words in line need add **if freq>3 stop adding
	private Map<String, Integer> frequencyWords() {
		Map<String, Integer> frequency = new HashMap<>();
		String s = description.replaceAll("[,.?:;\"!]", "").toLowerCase(); // canonization
		String[] words = s.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 3) {
				if (frequency.containsKey(words[i])) {
					frequency.put(words[i], (frequency.get(words[i]) + 1));
				} else {
					frequency.put(words[i], 1);
				}
			}
		}
		Map<String, Integer> frequency1 = new HashMap<>();
		for (Map.Entry<String, Integer> step_user : frequency.entrySet())
			if (frequency.get(step_user.getKey()) > 2) {
				frequency1.put(step_user.getKey(), step_user.getValue());
			}
		return frequency1;
	}

	@Override
	public String toString() {
		return name_of_Film+" \ngeneral_Point=" + general_Point + "\nIMDB=" + IMDB + "\nactors=" + actors + "\ngenres=" + genres
				+ "\ndirectors=" + directors + "\nstudious=" + studious + "\ndescription=" + description + "\n\n\n";
	}

}
