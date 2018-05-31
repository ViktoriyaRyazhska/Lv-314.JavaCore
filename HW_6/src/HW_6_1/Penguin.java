package HW_6_1;

public class Penguin extends NonFlyingBird {

	public Penguin (String feathers, boolean layEggs) {
		super.setFeathers(feathers);
		super.setLayEggs(layEggs);
		super.setBird_type("Penguin");
	}
}
