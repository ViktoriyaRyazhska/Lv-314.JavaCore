package _pasted_code_;

public class Main {

	public static void main(String[] args) {
		Animal[] ol = new Animal[2];
		
		ol[0] = new Cats();
		ol[1] = new Dogs();

		for (int i = 0; i < ol.length; i++) {
			System.out.println(ol[i].voice());
		}

	}

}
