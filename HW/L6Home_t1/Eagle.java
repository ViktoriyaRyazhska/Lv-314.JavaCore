package L6Home_t1;

public class Eagle extends FlyingBird {
	Eagle() {
	}

	Eagle(boolean lay_eggs, boolean feathers) {
		super.setLayEggs(lay_eggs);
		super.setFeathers(feathers);

	}
	@Override
	boolean fly() {
		return super.fly();
	}

	@Override
	public boolean getFeathers() {
		return super.getFeathers();
	}

	@Override
	public void setLayEggs(boolean layEggs) {
		super.setLayEggs(layEggs);
	}

	@Override
	public boolean getLayEggs() {
		return super.getLayEggs();
	}

	@Override
	public void setFeathers(boolean feathers) {
		super.setFeathers(feathers);
	}
	
}
