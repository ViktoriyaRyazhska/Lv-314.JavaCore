package task_1;
public class Swallow extends FlyingBird{

	private String feathers;
	private String layEggs;
	
	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}
	
	public void fly() {
		System.out.println("I'm flying bird");
	}
	
	public Swallow(){}
	
	public Swallow(String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	@Override
	public void info() {
		System.out.println("I'm a swallow");
		super.info();
		System.out.println(feathers+", eggs is "+layEggs );
	}
	
}
