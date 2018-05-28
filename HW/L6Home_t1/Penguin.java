package L6Home_t1;

public class Penguin extends NonFlyingBird {
	Penguin() {
	}

	Penguin(boolean lay_eggs, boolean feathers) {
		super.setLayEggs(lay_eggs);
		super.setFeathers(feathers);
	}
}
