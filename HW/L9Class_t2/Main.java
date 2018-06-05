package L9Class_t2;

public class Main {
	public static void main(String[] args)  {
		Plant[] flowers = new Plant[3];
try {
	flowers[0] = new Plant(5, "red", "rose");
} catch (TypeException|ColorException e) {
	System.err.println(e.getMessage());
}
try {
	flowers[1] = new Plant(3, "joe", "violets");
} catch (TypeException|ColorException e) {
	System.err.println(e.getMessage());
}
try {
	flowers[2] = new Plant(1, "red", "Kukurudza");
} catch (TypeException|ColorException e) {
	System.err.println(e.getMessage());
}

	}
}
