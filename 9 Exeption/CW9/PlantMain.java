
public class PlantMain {

	public static void main(String[] args) {

		Plant[] pl = new Plant[5];
		try {
			pl[0] = new Plant(5, "blue", "type1");
		} catch (TypeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (ColorExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (negativeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			pl[1] = new Plant(-3, "red", "type2");
		} catch (TypeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (ColorExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (negativeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			pl[2] = new Plant(3, "yellow", "type234");
		} catch (TypeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (ColorExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (negativeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			pl[3] = new Plant(6, "yellow", "type4");
		} catch (TypeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (ColorExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (negativeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			pl[4] = new Plant(0, "yedfsllow", "tsfype4");
		} catch (TypeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (ColorExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (negativeExeption e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		for (Plant plant : pl) {
			System.out.println(plant);
		}
	}

}
