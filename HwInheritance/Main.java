package HwInheritance;

public class Main {
	public static Employee[] sortEmployee(Employee[] staff) {
		Employee tempEmployee=new Employee();
		
		for (int i=0; i<staff.length; i++) {
			for(int j=i+1; j<staff.length; j++) {
				if ( staff[i].calulatePay()<staff[j].calulatePay()) {
					tempEmployee=staff[i];
					staff[i]=staff[j];
					staff[j]=tempEmployee;
				}
			}
		}

		return staff;
	}

	public static void main(String[] args) {
		Bird[] folkOfBirds = new Bird[4];
		folkOfBirds[0] = new Eagle();
		folkOfBirds[1] = new Swallow();
		folkOfBirds[2] = new Penguine();
		folkOfBirds[3] = new Chichen();

		for (int i = 0; i < folkOfBirds.length; i++) {
			folkOfBirds[i].fly();
		}
		Employee[] staff=new Employee[4];
		staff[0]=new SalariedEmployee("Stansilav","zhur134",3453534,8,240);
		staff[1]=new SalariedEmployee("Vasya","vasya134",3464434,19,50);
		staff[2]=new ContractEmployee("Srgriy","serg375",4638765,2400);
		staff[3]=new ContractEmployee("Ivan","iva335",44646,2750);
		
		
		Main.sortEmployee(staff);
		//---------------------------------------------------
		for (int i = 0; i < staff.length; i++) {
			System.out.println(staff[i].toString());

			System.out.println();
		}
	}

}
