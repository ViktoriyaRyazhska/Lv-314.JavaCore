package LwExceptions;
public class Plant {
	Color col;
	Type typ;
	int size;

	public Plant() {
	}

	public Plant(Color col, Type typ, int size) throws ColorExceprion, TypeException {
		super();
		if (col == Color.RED || col == Color.BLOUE || col == Color.YELLOW) {
			this.col = col;
		} else {
			throw new ColorExceprion("not valid color ");
		}
		if (typ == Type.ROSSE || typ == Type.DAISY) {
			this.typ = typ;
		} else {
			throw new TypeException("not valid type ");
		}

		this.size = size;
	}

	@Override
	public String toString() {
		return "Plant [col=" + col + ", typ=" + typ + ", size=" + size + "]";
	}

}
