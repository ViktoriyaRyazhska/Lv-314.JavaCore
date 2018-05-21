import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Task 1
		
		System.out.println();
		System.out.println("Task 1");
		
		System.out.println("Enter first float number");
		float f1 = Float.parseFloat(reader.readLine());
		System.out.println("Enter second float number");
		float f2 = Float.parseFloat(reader.readLine());
		System.out.println("Enter third float number");
		float f3 = Float.parseFloat(reader.readLine());

		if ((f1 >= -5 && f1 <= 5) && (f2 >= -5 && f2 <= 5) && (f3 >= -5 && f3 <= 5)) {
			System.out.println("All of your numbers belong to the range [-5, 5]");
		} else {
			System.out.println("One or more of your numbers do not belong to the range [-5, 5]");
		}
		
//		Task 2
		
		System.out.println();
		System.out.println("Task 2");
		
		System.out.println("Enter first integer number");
		int i1 = Integer.parseInt(reader.readLine());
		System.out.println("Enter second integer number");
		int i2 = Integer.parseInt(reader.readLine());
		System.out.println("Enter third integer number");
		int i3 = Integer.parseInt(reader.readLine());
		
		int max = i1;
		int min = i2;
		
		if (i2 > max) {
			max = i2;
			if (i3 > max) {
				max = i3;
			}
		} else if (i3 > max) {
			max = i3;
		}
		
		if (i2 < min) {
			min = i2;
			if (i3 < min) {
				min = i3;
			}
		} else if (i3 < min) {
			min = i3;
		}
		
		System.out.println("Max of your integer nums is " + max);
		System.out.println("Min of your integer nums is " + min);

//		Task 3
		
		System.out.println();
		System.out.println("Task 3");
		
		HTTPError httperror = null;
		
		System.out.println("Enter HTTP Error code [400, 410]");
		
		switch (Integer.parseInt(reader.readLine())) {
		case 400:
			httperror = HTTPError.BAD_REQUEST;
			break;
		case 401:
			httperror = HTTPError.UNAUTHORIZED;
			break;
		case 402:
			httperror = HTTPError.PAYMENT_REQUIRED;
			break;
		case 403:
			httperror = HTTPError.FORBIDDEN;
			break;
		case 404:
			httperror = HTTPError.NOT_FOUND;
			break;
		case 405:
			httperror = HTTPError.METHOD_NOT_ALLOWED;
			break;
		case 406:
			httperror = HTTPError.NOT_ACCEPTABLE;
			break;
		case 407:
			httperror = HTTPError.PROXY_AUTHENTICATION_REAUIRED;
			break;
		case 408:
			httperror = HTTPError.REQUEST_TIMEOUT;
			break;
		case 409:
			httperror = HTTPError.CONFLICT;
			break;
		case 410:
			httperror = HTTPError.GONE;
			break;
		}
		
		System.out.println("Your HTTP Error's name is " + httperror);
		
//		Task 4
		
		System.out.println();
		System.out.println("Task 4");
		
		Dog dog1 = new Dog("Rocky", Breed.BEAGLE, 4);
		Dog dog2 = new Dog("Toby", Breed.LABRADOR, 5);
		Dog dog3 = new Dog("Lola", Breed.POODLE, 1);
		
		if (!dog1.getName().equals(dog2.getName()) && !dog1.getName().equals(dog3.getName()) && !dog2.getName().equals(dog3.getName())) {
			System.out.println("There is no two dogs with the same name");
		} else {
			System.out.println("There is dog with the same name");
		}
		
		int oldest = -1;
		
		if (oldest < dog1.getAge()) {
			oldest = dog1.getAge();
			if (oldest < dog2.getAge()) {
				oldest = dog2.getAge();
				if (oldest < dog3.getAge()) {
					oldest = dog3.getAge();
					System.out.println("The oldest dog is " + dog3.getName() + " and it is a " + dog3.getBreed());
				} else {
					System.out.println("The oldest dog is " + dog2.getName() + " and it is a " + dog2.getBreed());
				}
			} else if (oldest < dog3.getAge()) {
				oldest = dog3.getAge();
				System.out.println("The oldest dog is " + dog3.getName() + " and it is a " + dog3.getBreed());
			} else {
				System.out.println("The oldest dog is " + dog1.getName() + " and it is a " + dog1.getBreed());
			}
		}
	}

}
