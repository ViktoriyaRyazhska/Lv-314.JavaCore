package HW6_1;

public abstract class Bird {
	boolean feathers;
	boolean layEggs; 
	
	public abstract void fly ();

	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public boolean isFeathers() {
		return feathers;
	}


	public boolean isLayEggs() {
		return layEggs;
	}

	
}
