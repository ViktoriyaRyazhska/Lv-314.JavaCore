package console.realization;

public class User {
private Film[] likeFilms;
private Film[] dislikeFilms;
private int age;
private boolean sex=true; // TRUE-MAN FALSE-WOMAN

public User(Film[] likeFilms, Film[] dislikeFilms, int age, boolean sex) {
	this.likeFilms = likeFilms;
	this.dislikeFilms = dislikeFilms;
	this.age = age;
	this.sex = sex;
}
public Film[] getLikeFilms() {
	return likeFilms;
}
public void setLikeFilms(Film[] likeFilms) {
	this.likeFilms = likeFilms;
}
public Film[] getDislikeFilms() {
	return dislikeFilms;
}
public void setDislikeFilms(Film[] dislikeFilms) {
	this.dislikeFilms = dislikeFilms;
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

}
