package _pasted_code1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		Person[] p = new Person[5];
		p[0] = new Student();
		p[1] = new Cleaner();
		p[2] = new Teacher();
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Staff) {
				((Staff) p[i]).salary();

				p[i].print();
			}
		}

	}
}
