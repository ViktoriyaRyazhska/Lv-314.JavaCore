package LessonWork9;

public class Plant {
	
      Color color ;
      Type type ;
      int size ;
      
      public Plant () {
    	  
      }
      public Plant(Color col, Type typ, int size) throws ColorExceprion, TypeException {
  		super();
  		if (color == Color.RED || col == Color.GREEN || col == Color.WHITE) {
  			this.color = col;
  		} else {
  			throw new ColorExceprion("not valid color ");
  		}
  		

  		this.size = size;
  	}

  	@Override
  	public String toString() {
  		return "Plant [col=" + color + ", typ=" + type + ", size=" + size + "]";
  	}

  }
