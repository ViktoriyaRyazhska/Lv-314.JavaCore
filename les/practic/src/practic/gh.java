package practic;

public class gh {

	public static void main(String[] args) {
		int [] mass = {3,-4,7, 9,4};
		int max = mass[0];
		int imax = 0;
		int i = 0;
		while (i < mass.length) {
		if (mass[i] > max) {
		max = mass[i];
		imax =i;
		
		}
		i++;
			}
				System.out.print("Maximum = " + max);
				System.out.println(" is in " + (imax + 1) + " place");


	}

}
