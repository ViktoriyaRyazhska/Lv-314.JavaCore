
public class Plant {
	private int size;
	private Color color;
	private Type type;

	public Plant(int size, String color, String type) throws TypeExeption, ColorExeption, negativeExeption {
		if (size <= 0) {
			throw new negativeExeption("Size is <=0");
		}
		this.size = size;
		this.color = colorCheck(color);
		this.type = typeCheck(type);
	}

	public Color colorCheck(String color) throws ColorExeption {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.blue;
		case "red":
			return Color.red;
		case "green":
			return Color.red;
		case "yellow":
			return Color.red;

		default:
			throw new ColorExeption("No such color");
		}
	}

	public Type typeCheck(String type) throws TypeExeption {
		switch (type.toLowerCase()) {
		case "type1":
			return Type.type1;
		case "type2":
			return Type.type3;
		case "type3":
			return Type.type3;
		case "type4":
			return Type.type4;
		case "type5":
			return Type.type5;

		default:
			throw new TypeExeption("No such type");
		}
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

}
