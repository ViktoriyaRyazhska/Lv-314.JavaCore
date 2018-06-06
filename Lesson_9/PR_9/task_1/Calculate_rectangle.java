package task_1;
public class Calculate_rectangle {

 public static double calculate_rectangle (double height, double width) throws RectangleException{

if (height <= 0 || width <= 0) throw new RectangleException("height or width is negative or is zero");
	 return height*width;
 }
}
