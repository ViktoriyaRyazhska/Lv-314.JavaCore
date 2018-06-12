package Birds;

public abstract class Bird {

	public abstract void fly();

	private String feathers;
	private boolean layEggs;
	private String bird_type;

	public Bird() {
	}

	public String getBird_type() {
		return bird_type;
	}

	public void setBird_type(String bird_type) {
		this.bird_type = bird_type;
	}

	public Bird(String feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

}
