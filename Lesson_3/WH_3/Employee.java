public class Employee {

	private String name;
	private float rate;
	private float hours;
	static private double totalHours=0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.totalHours-=this.hours;
		this.hours = hours;
		this.totalHours+=(double)hours;
	}
	
	public Employee(){}
	
	public Employee(String name, float rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, float rate, float hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		this.totalHours+=(double)hours;
	}
	
	
	
	public float salary() {
		return rate * hours;
	}
	
	public String toStrig(){
		return "Name - "+name+", rate - "+rate+", studied for "+hours+"hours.";
	}
	
	public void changeRate(float rate){
		this.rate=rate;
	}
	
	public float bonuses(float perсent) {
		return (perсent*salary())/100;
	}
	
	public void all_Time(){
		System.out.println("Total hours of all workers "+totalHours);
	}
	
	
	
	
	
	
}
