package conditionalStatementsLW;

public class WeekDay {
	public static void printWeek(int DayNumber) {
		switch (DayNumber) {
		case 1:
			System.out.println("Monday �������� �����������");
			break;
		case 2:
			System.out.println("Tuesday ³������ �������");
			break;
		case 3:
			System.out.println(" Wednesday  ������ �����");
			break;
		case 4:
			System.out.println("Thursday ������ �������");
			break;
		case 5:
			System.out.println("Friday ������� �������");
			break;
		case 6:
			System.out.println("Saturday ������ �������");
			break;
		case 7:
			System.out.println("Sunday ����� �����������");
			break;
		default:
			System.out.println("This is not a number of the weekday ");
			break;
		}
	}
}
