package t2;

public class DayOfWeek {

	public static String showDay(int day) {
		switch (day) {
		case 1:
			return "Sunday ���1�� �����������";
		case 2:
			return "Monday �����1��� �����������";
		case 3:
			return "Thuesday �1������ �������";
		case 4:
			return "Wednesday ������ �����";
		case 5:
			return "Thursday ������ �������";
		case 6:
			return "Friday ������� �������";
		case 7:
			return "Saturday ������ ������ ";
		default:
			return "Error!";
		}

	}
}
