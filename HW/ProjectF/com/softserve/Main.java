package com.softserve;

public class Main {

	public static void main(String[] args) {
		User IlkivPetro = new User(11, true);
		runFilmFinder(IlkivPetro);

	}

	public static void runFilmFinder(User user) {
		Source.base(); // create  base of films
		user.pickGoodFilms();
		user.info();
		user.getLikeFilms().forEach(System.out::println);
		Film.pickUpFilms(user);// compare
		Source.getFilms().forEach(System.out::println);

	}
}
