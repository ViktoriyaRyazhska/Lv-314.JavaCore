package com.softserve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
	private List<Film> likeFilms = new ArrayList<>();
	private List<Film> dislikeFilms = new ArrayList<>();
	private int age = 1;
	private boolean sex = true; // TRUE-MAN FALSE-WOMAN

	public User(int age, boolean sex) {
		this.age = age;
		this.sex = sex;

	}

	public List<Film> getLikeFilms() {
		return likeFilms;
	}

	public List<Film> getDislikeFilms() {
		return dislikeFilms;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public void pickGoodFilms() {
		likeFilms.add(Source.getFilms().get(0));
		Source.getFilms().remove(0);
	}

	public void pickBadFilms() {
		System.out.println("Getting films what you dislike..");
		dislikeFilms.add(Source.getFilms().get(0));
		Source.getFilms().remove(0);
	}

	public void info() {
		if (age < 12) {
			for (int i = 0; i < likeFilms.size(); i++) {
				likeFilms.get(i).addGenres(Arrays.asList("Family", "fantasy", "cartoon"));
			}
		} else if (age > 12 && age < 18) {
			for (int i = 0; i < likeFilms.size(); i++) {
				likeFilms.get(i).addGenres(Arrays.asList("fantasy", "serial", "comedy"));
			}
		} else if (age > 18 && age < 25) {
			for (int i = 0; i < likeFilms.size(); i++) {
				likeFilms.get(i).addGenres(Arrays.asList("comedy", "action", "adventure"));
			}
		} else {
			for (int i = 0; i < likeFilms.size(); i++) {
				likeFilms.get(i).addGenres(Arrays.asList("biographical", "documentary", "historical"));
			}
		}
		if (sex) {
			for (int i = 0; i < likeFilms.size(); i++) {
				likeFilms.get(i)
						.addGenres(Arrays.asList("crime & gangster films", "horror", "war", "westerns", "superhero"));
			}
		} else {
			for (int i = 0; i < likeFilms.size(); i++) {
				likeFilms.get(i).addGenres(Arrays.asList("melodramas", "epics", "drama", "adventure", "romance"));
			}
		}
	}

}
