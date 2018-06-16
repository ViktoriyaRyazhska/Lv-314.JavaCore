package com.softserve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Source {
	private static List<Film> sourse = new ArrayList<>();

	public static List<Film> getFilms() {
		return sourse;
	}

	public static void base() {
		// name,rait,actors,genres,directors,studious,description)
		sourse.add(new Film("The Shawshank Redemption", 93,
				Arrays.asList("Tim Robbins", "Morgan Freeman", "Bob Gunton"), Arrays.asList("Criminal", "Drama"),
				Arrays.asList("Columbia Pictures", "Warner Bros"), Arrays.asList("Frank Darabont"),
				"Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."));
		sourse.add(new Film("The Godfather", 92, Arrays.asList("Marlon Brando", "Al Pacino", "James Caan"),
				Arrays.asList("Criminal", "Drama"), Arrays.asList("Paramount Pictures"),
				Arrays.asList("Francis Ford Coppola"),
				"The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
		sourse.add(new Film("The Dark Knight", 90, Arrays.asList("Christian Bale","Heath Ledger","Aaron Eckhart"),
				Arrays.asList("Action","Crime", "Drama"), Arrays.asList("Warner Brothers","DC Comics"),
				Arrays.asList("Christopher Nolan"), "When the menace known as the Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham. The Dark Knight must accept one of the greatest psychological and physical tests of his ability to fight injustice."));
		sourse.add(new Film("Schindler's List", 89, Arrays.asList("Liam Neeson", "Ralph Fiennes", "Ben Kingsley"),
				Arrays.asList("Biography", "Drama", "History"), Arrays.asList("Universal Pictures"),
				Arrays.asList("Steven Spielberg"), "In German-occupied Poland during World War II, Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazi Germans."));
		sourse.add(new Film("Pulp Fiction", 89, Arrays.asList("John Travolta", "Uma Thurman", "Samuel L. Jackson"),
				Arrays.asList("Crime", "Drama"), Arrays.asList("Miramax"),
				Arrays.asList("Quentin Tarantino"), "The lives of two mob hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption."));
		sourse.add(new Film("Fight Club", 88, Arrays.asList("Brad Pitt", "Edward Norton", "Meat Loaf"),
				Arrays.asList("Drama"), Arrays.asList("20th Century Fox"),
				Arrays.asList("David Fincher"), "An insomniac office worker, looking for a way to change his life, crosses paths with a devil-may-care soapmaker, forming an underground fight club that evolves into something much, much more."));
		sourse.add(new Film("Forrest Gump", 88, Arrays.asList("Tom Hanks, Robin Wright, Gary Sinise"),
				Arrays.asList("Drama", "Romance"), Arrays.asList("Paramount Pictures"),
				Arrays.asList("Robert Zemeckis"), "The presidencies of Kennedy and Johnson, Vietnam, Watergate, and other history unfold through the perspective of an Alabama man with an IQ of 75."));
		sourse.add(new Film("Inception", 88, Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page"),
				Arrays.asList("Action", "Adventure", "Sci-Fi"), Arrays.asList("Syncopy Inc.", "Legendary Pictures", "Warner Brothers"),
				Arrays.asList("Christopher Nolan"), "A thief, who steals corporate secrets through the use of dream-sharing technology, is given the inverse task of planting an idea into the mind of a CEO."));
		sourse.add(new Film("Goodfellas", 87, Arrays.asList("Robert De Niro", "Ray Liotta", "Joe Pesci"),
				Arrays.asList("Biography", "Crime", "Drama"), Arrays.asList("Warner Brothers"),
				Arrays.asList("Martin Scorsese"), "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate."));
		sourse.add(new Film("Avengers: Infinity War", 88, Arrays.asList(" Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo"),
				Arrays.asList("Action", "Adventure", "Fantasy"), Arrays.asList("Marvel Studios"),
				Arrays.asList("Anthony Russo"), "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe."));
		sourse.add(new Film("It's a Wonderful Life", 86, Arrays.asList("James Stewart", "Donna Reed", "Lionel Barrymore"),
				Arrays.asList("Drama", "Family", "Fantasy"), Arrays.asList("Liberty Films"),
				Arrays.asList("Frank Capra"), "An angel is sent from Heaven to help a desperately frustrated businessman by showing him what life would have been like if he had never existed."));

	}
}
