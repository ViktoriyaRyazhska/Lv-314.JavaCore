package L9Class_t2;

public class Plant {
	private int size;
	private Colour colour;
	private Type type;

	public Plant() {
	}

	public Plant(int size, String colour, String type) throws ColorException, TypeException {
		this.size = size;
		this.colour = this.checkColour(colour);
		this.type = this.checkType(type);
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", colour=" + colour + ", type=" + type + "]";
	}

	private Colour checkColour(String colour) throws ColorException {
		switch (colour.toLowerCase()) {
		case "red":
			return Colour.RED;
		case "blue":
			return Colour.BLUE;
		case "green":
			return Colour.GREEN;
		default:
			throw new ColorException();
		}
	}

	private Type checkType(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.ROSE;
		case "podoroznik":
			return Type.PODOROZNIK;
		case "violets":
			return Type.VIOLETS;
		default:
			throw new TypeException();
		}
	}
}
