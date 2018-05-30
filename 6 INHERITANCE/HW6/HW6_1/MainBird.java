package HW6_1;

public class MainBird {

	public static void main(String[] args) {

	Bird [] br = new Bird [4];	
		br [0] = new Eagle (true, true);
		br [1] = new Swallow (true, false);
		br [2] = new Penguin (false, true);
		br [3] = new Chicken (false, false);
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i].isFeathers());
			System.out.print(" "+br[i].isLayEggs());
			System.out.print(" ");
			br[i].fly();
			
		}
		
		}
	}


