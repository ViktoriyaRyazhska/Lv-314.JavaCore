package L6Home_t1;

public class Chicken extends NonFlyingBird {

	Chicken() {
	}

	Chicken(boolean lay_eggs, boolean feathers) {
		super.setLayEggs(lay_eggs);
		super.setFeathers(feathers);
	}
}
