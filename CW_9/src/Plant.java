
public class Plant {
	private int size;
	private Colour colour;
	private Type type;

	public Plant() {
	}

	public Plant(int size, String colour, String type) throws TypeException, ColourException {
		Colour col = colourToEnum(colour);
		Type typ = typeToEnum(type);
		this.size = size;
		this.colour = col;
		this.type = typ;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plant: size - " + size + ", colour - " + colour + ", type - " + type;
	}
	
	private Colour colourToEnum(String colour) throws ColourException {
		switch(colour.toLowerCase()) {
		case "red" : return Colour.RED;
		case "blue" : return Colour.BLUE;
		case "white" : return Colour.WHITE;
		default : throw new ColourException("Enter one of the following colours: RED/BLUE/WHITE");
		}
	}
	
	private Type typeToEnum(String type) throws TypeException {
		switch(type.toLowerCase()) {
		case "daisy" : return Type.DAISY;
		case "tulip" : return Type.TULIP;
		case "rose" : return Type.ROSE;
		default : throw new TypeException("Enter one of the following types: ROSE/TULIP/DAISY");
		}
	}
}
