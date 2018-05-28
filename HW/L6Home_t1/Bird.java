package L6Home_t1;
/*Develop abstract class Bird with attributes
feathers and layEggs and an abstract method
fly(). Develop classes FlyingBird and
NonFlyingBird. Create class Eagle, Swallow,
Penguin and Chicken.
Create array Bird and add different birds to it.
Call fly() method for all of it. Output the
information about each type of created bird.*/

public abstract class Bird {
	private boolean feathers;
	private boolean layEggs;
	
	public Bird() {
	}
	
	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}	

	public boolean getFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public boolean getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	abstract boolean fly();

}
