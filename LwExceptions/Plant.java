package LwExceptions;

public class Plant {
	private Color col;
	private Type typ;
	private int size;

	public void setCol(Color col) {
		this.col = col;
	}

	public void setTyp(Type typ) {
		this.typ = typ;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color StringToColor(String col) throws ColorExceprion {
		Color[] solors = Color.values();
		Color color = null;
		for (int i = 0; i < solors.length; i++) {
			if (solors[i].toString().equals(col.toUpperCase())) {
				color = solors[i];

			}
		}
		if (color != null) {
			return color;

		} else {
			throw new ColorExceprion("no such color");
		}

	}

	public Type StringToType(String typ) throws TypeException {
		Type[] types = Type.values();
		Type type = null;
		for (int i = 0; i < types.length; i++) {
			if (types[i].toString().equals(typ.toUpperCase())) {
				type = types[i];

			}
		}
		if (type != null) {
			return type;

		} else {
			throw new TypeException("no such type");
		}

	}

	public Plant() {
	}

	public Plant(String col, String typ, int size) throws ColorExceprion, TypeException {
		this.setTyp(StringToType(typ));
		this.setCol(StringToColor(col));
		this.setSize(size);

	}

	@Override
	public String toString() {
		return "Plant [col=" + col + ", typ=" + typ + ", size=" + size + "]";
	}

}
