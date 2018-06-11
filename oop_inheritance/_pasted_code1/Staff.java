package _pasted_code1;

public abstract class Staff extends Person {
	@Override
	public void print() {
		System.out.println("I am Staff");

	}

	 abstract public void salary();
	 
	 public Staff () {
		 
	 }
		
	 public Staff (String name) {
		   super(name);
		   
	   }
}
