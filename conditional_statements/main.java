package  lesson ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	
	public static void Range (double a ,double b , double c ) {
		if ((a > -5.0)&&(a < 5.0)) {
			System.out.println("the number has fallen into the range [-5; 5]");
		}
		else {
			System.out.println("ERROR");}
		if ((b > -5.0)&&(b < 5.0)) {
			System.out.println("the number has fallen into the range [-5; 5]");
		}else {
			System.out.println("ERROR");}
		if ((c > -5.0)&&(c < 5.0)) {
			System.out.println("the number has fallen into the range [-5; 5]");
		}else {
			System.out.println("ERROR");}
	}
	
  public static void MaxMin (int x ,int y ,int z) {
	  if ((x > y) && (x > z)){
			System.out.println("first - is max");
		}
		else if ((x < y) && (x < z)) {
			System.out.println("first - is min");}
	    if ((y > x) && (y > z)) {
			System.out.println("second - is max");}
		else if ((y < x) && (y < z)) {
			System.out.println("second - is min");}
		
		if ((z > x) && (z > y)) {
			System.out.println("third - is max");}
		else if ((z < x) && (z < y)) {
			System.out.println("third - is min");}
  }
  
  public static void Error (int numb) {
	 
	  HTTPError_4 er = null;
	    switch ( numb){
	        case 444 :
	            er = HTTPError_4.NoResponse;
	            break;
	        case 449 :
	            er = HTTPError_4.RetryWith;
	            break;
	        case 451 :
	        	er = HTTPError_4.Redirect;
	        default :
	        	System.out.println("this error is not recognized"); 
	    }
	    System.out.println(er);
  }
	    
	    public static void main (String[] args) throws NumberFormatException, IOException {
        
	    	BufferedReader ol = new BufferedReader (new InputStreamReader(System.in));
	    	
	    System.out.print("READ 3 float numbers ?:" + "\n");
	    Range (3.2, 6.4, 3.5);
	    System.out.print("READ 3 integer numbers and write max and min of them:"+ "\n");
	    MaxMin (4, 3, 7 );
	    System.out.print("READ 3 float numbers ?:"+ "\n");
	    Error (444);
	    
	    Dogs dog = new Dogs("sd",21 , breed.Labrador );
		}
		
  }

	
	
   
   





 
		
	


	




