public class Fabinachi {
	public static void  fabinachi(int amount ) {
		int fabOne=0;
		int fabTwo=1;
		int fabCurrent=0;
		for ( int i=0; i<amount;i++) { 
			fabCurrent=fabOne+fabTwo;
			System.out.println(fabCurrent);
			fabOne=fabTwo;
			fabTwo=fabCurrent;
		}
	}

}
