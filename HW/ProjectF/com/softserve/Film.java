package com.softserve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Film {
	private int position = 0;
	private int raiting = 1;
	private String filmName;
	private List<String> actors;
	private List<String> genres;
	private List<String> directors;
	private List<String> studious;
	private String description;

	public Film(String filmName, int raiting, List<String> actors, List<String> genres, List<String> directors,
			List<String> studious, String description) {
		this.filmName = filmName;
		this.position += raiting;
		this.actors = actors;
		this.genres = genres;
		this.directors = directors;
		this.studious = studious;
		this.description = description;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getActors() {
		return actors;
	}

	public int getFilmRank() {
		return position;
	}

	public void setFilmRank(int filmRank) {
		this.position = filmRank;
	}

	public int getRaiting() {
		return raiting;
	}

	public void setRaiting(int raiting) {
		this.raiting = raiting;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public void addGenres(List<String> depend) {
		List<String> union = new ArrayList<String>();
		union.addAll(this.genres);
		union.addAll(depend);
		this.genres = union;
	}

	public List<String> getDirectors() {
		return directors;
	}

	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	public List<String> getStudious() {
		return studious;
	}

	public void setStudious(List<String> studious) {
		this.studious = studious;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public float getRait() {
		return raiting;
	}

	public void setRait(int rait) {
		this.raiting = rait;
	}

	public void setActors(String name_actors) {
		this.actors.add(name_actors);
	}

	public float getGeneral_Point() {
		return position;
	}

	private static void calcActorPoint(User user) {
		for (int i = 0; i < user.getLikeFilms().size(); i++) {
			for (int j = 0; j < Source.getFilms().size(); j++) {
				for (String userVar : user.getLikeFilms().get(i).actors) {
					for (String sourseVar : Source.getFilms().get(j).actors) {
						if (userVar.equals(sourseVar)) {
							Source.getFilms().get(j).position++;
						}
					}
				}
			}
		}
	}

	private static void calcGenrePoint(User user) {
		for (int i = 0; i < user.getLikeFilms().size(); i++) {
			for (int j = 0; j < Source.getFilms().size(); j++) {
				for (String userVar : user.getLikeFilms().get(i).genres) {
					for (String sourseVar : Source.getFilms().get(j).genres) {
						if (userVar.equals(sourseVar)) {
							Source.getFilms().get(j).position++;
						}
					}
				}
			}
		}
	}

	private static void calcDirectorPoint(User user) {
		for (int i = 0; i < user.getLikeFilms().size(); i++) {
			for (int j = 0; j < Source.getFilms().size(); j++) {
				for (String userVar : user.getLikeFilms().get(i).directors) {
					for (String sourseVar : Source.getFilms().get(j).directors) {
						if (userVar.equals(sourseVar)) {
							Source.getFilms().get(j).position++;
						}
					}
				}
			}
		}
	}

	private static void calcStudioPoint(User user) {
		for (int i = 0; i < user.getLikeFilms().size(); i++) {
			for (int j = 0; j < Source.getFilms().size(); j++) {
				for (String userVar : user.getLikeFilms().get(i).studious) {
					for (String sourseVar : Source.getFilms().get(j).studious) {
						if (userVar.equals(sourseVar)) {
							Source.getFilms().get(j).position++;
						}
					}
				}
			}
		}
	}

	private static void calcRDF(User user) {
		int count_same_words = 0;
		for (int i = 0; i < user.getLikeFilms().size(); i++) {
			for (int j = 0; j < Source.getFilms().size(); j++) {
				for (Map.Entry<String, Integer> step_user : user.getLikeFilms().get(i).frequencyWords().entrySet())
					for (Map.Entry<String, Integer> step_next : Source.getFilms().get(j).frequencyWords().entrySet())
						if (step_user.getKey().equals(step_next.getKey()))
							count_same_words++;
				Source.getFilms().get(j).position += count_same_words * 2;
			}
		}
	}

	// Finds frequency words in line
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

	// compare all films and assigns each movie
	public static void pickUpFilms(User user) {
		calcActorPoint(user);
		calcDirectorPoint(user);
		calcGenrePoint(user);
		calcStudioPoint(user);
		calcRDF(user);
		Source.getFilms().sort((a, b) -> b.position - a.position);

	}

	@Override
	public String toString() {

		return filmName + " \ngeneral_Point=" + position;
	}

}
