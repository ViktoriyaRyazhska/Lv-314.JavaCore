package console.realization;
import java.util.HashMap;
import java.util.Map;

public class Film {
	private float general_Point = 0;
	private float IMDB = 1;
	private String[] actors; // its contains actors of film witch user selected
	private String[] genres;
	private String[] directors;
	private String[] studious;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getActors() {
		return actors;
	}

	public float getIMDB() {
		return IMDB;
	}

	public void setIMDB(float iMDB) {
		this.IMDB = iMDB;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
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

	public static float calcRDF(Film user_film, Film next_film) {// relevance description films
		int count_same_words = 0;
		float percent_similarity = 0;
		Map<String, Integer> user_film1 = new HashMap<>();// frequency of user film
		Map<String, Integer> next_film1 = new HashMap<>();
		user_film1.putAll(user_film.frequencyWords());
		next_film1.putAll(next_film.frequencyWords());
		for (Map.Entry<String, Integer> step_user : user_film1.entrySet()) {
			for (Map.Entry<String, Integer> step_next : next_film1.entrySet()) {
				if (step_user.getKey().equals(step_next.getKey())) {
					count_same_words++;
					percent_similarity += step_next.getValue() / step_user.getValue();
				}
			}
		}

		return 1/(percent_similarity / count_same_words);
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
		return frequency;
	}
	

}
