package HW_6_1;

public class Chicken extends NonFlyingBird {

	public Chicken (String feathers, boolean layEggs) {
		super.setFeathers(feathers);
		super.setLayEggs(layEggs);
		super.setBird_type("Chicken");
	}
}
