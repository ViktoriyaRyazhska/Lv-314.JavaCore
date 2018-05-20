package conditionalStatementsLW;

public class OddFunctin {

	public static int  Number(int a , int b , int c) {
		int counter=0; 
		if ( a%2!=0){
			counter++;
		}
		if ( b%2!=0){
			counter++;
		}
		if ( c%2!=0){
			counter++;
		}
		return  counter; 
	}

}
