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
		sourse.add(new Film("Home Alone1", 65, Arrays.asList("Brad", "Samson", "Olec"),
				Arrays.asList("comedy", "fantastic", "horror"), Arrays.asList("warner brosers"),
				Arrays.asList("Eshton Filcher"), "The McCallister family is preparing to spend Christmas"));
		sourse.add(new Film("Home Alone2", 66, Arrays.asList("Kirj", "Samson", "Olec"),
				Arrays.asList("comedy", "fantastic", "action"), Arrays.asList("warner brosers"),
				Arrays.asList("Eshton Filcher"),
				"The McCallister family is preparing to spend Christmas in Paris, gathering at Peter and Kate's home outside of Chicago on the night before their departure. Peter and Kate's youngest son, eight-year-old Kevin, is being ridiculed by his siblings and cousins. A fight with his older brother, Buzz, results in Kevin getting sent to the third floor of the house for punishment, where he wishes that his family would disappear. During the night, heavy winds cause damage to power lines, which causes a temporary power outage and resets the alarm clocks, causing the entire family to oversleep. In the confusion and rush to get to the airport, Kevin is accidentally left behind."));
		sourse.add(new Film("Home Alone3", 65, Arrays.asList("Josef", "Samson", "Olec"),
				Arrays.asList("cartoon", "family film", "standup"), Arrays.asList("warner brosers"),
				Arrays.asList("Eshton Filcher"), "The McCallister family is preparing to spend Christmas"));

	}
}
