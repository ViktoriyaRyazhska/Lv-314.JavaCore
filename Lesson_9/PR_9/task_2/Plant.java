package task_2;

public class Plant {
	private int size;
	private ColorEnum  color;
	private TypeEnum type;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public ColorEnum getColor() {
		return color;
	}
	public void setColor(String color) throws ColorException{
	
			color_str_to_enum(color);
	}
	public TypeEnum getType() {
		return type;
	}
	public void setType(String type) throws TypeException{
			type_str_to_enum(type);
	}
	
	public Plant(int size, String color, String type)  throws ColorException,TypeException{
		this.size = size;
		color_str_to_enum(color);
		type_str_to_enum(type);
	}
	
	public Plant() {}
	
	public void color_str_to_enum(String color)  throws ColorException{
		ColorEnum colors_enum_arr[] = ColorEnum.values();
		for(int i=0; i<colors_enum_arr.length; i++) {
			if(color.toUpperCase().equals(colors_enum_arr[i].toString())) {
				this.color=colors_enum_arr[i];
				break;
			}
		}
		if(this.color==null){
			throw new ColorException("Unknown color");
		}
	}
	
	public void type_str_to_enum(String type)  throws TypeException{
		TypeEnum types_enum_arr[] = TypeEnum.values();
		for(int i=0; i<types_enum_arr.length; i++) {
			if(type.toUpperCase().equals(types_enum_arr[i].toString())) {
				this.type=types_enum_arr[i];
				break;
			}
		}
		if(this.type==null){
			throw new TypeException("Unknown type");
		}
	}
	
	@Override
	public String toString() {
		return "Plant size - " + size + ", color - " + color + ", type - " + type;
	}

}
