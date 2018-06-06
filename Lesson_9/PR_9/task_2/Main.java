package task_2;
public class Main {

	public static void main(String[] args) {

		try {
			Plant [] plants_arr = new Plant [5];
			plants_arr[0] = new Plant(12, "White", "rose");
				System.out.println(plants_arr[0].toString());
//			plants_arr[1] = new Plant(2, "Red", "dfdfgd");
//				System.out.println(plants_arr[1].toString());
			plants_arr[2] = new Plant(41, "Green", "tUlip");
				System.out.println(plants_arr[2].toString());
//			plants_arr[3] = new Plant(39, "Blue", "CHAMOMIle");
//				System.out.println(plants_arr[3].toString());
//			plants_arr[4] = new Plant(11, "Orange", "tUlip");
//				System.out.println(plants_arr[4].toString());
		} catch (ColorException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (TypeException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		System.out.println("End of program");
	}
}
