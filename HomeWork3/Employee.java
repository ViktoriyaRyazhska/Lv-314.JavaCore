

public class Employee {

	private String name;
	private int birth;
	
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name = name;}
	public int getBirth() {
		return birth;}
	public void setBirth(int birth) {
		this.birth = birth;}
	
	
	public Employee ( ) {}
	
	public Employee (String name , int birth ) {
	this.setName(name);
    this.setBirth(birth);
	}
	
	public void change_name (String name ) {
		this.setName(name);
	}
	public void input (String name , int birth) {
		this.setName(name);
        this.setBirth(birth);
	}
	public void output ( ) {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", birth=" + birth + "]";
	}
	
public static void main (String[] args)  {
     
	Employee x = new Employee ("oleg", 1998) ;
	Employee y = new Employee ("Nazar", 2010) ;
	Employee z = new Employee ("Vasja", 1876) ;
	
	x.output();
    y.output();
	z.output();
}
}
	