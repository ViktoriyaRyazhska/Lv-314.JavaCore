package L6Home_t1;
/*Develop abstract class Bird with attributes
feathers and layEggs and an abstarct method
fly(). Develop classes FlyingBird and
NonFlyingBird. Create class Eagle, Swallow,
Penguin and Chicken.

Create array Bird and add different birds to it.

Call fly() method for all of it. Output the

information about each type of created bird.*/

public abstract class Bird {
	private String feathers;
	private String layEggs;

	abstract boolean fly();

}
