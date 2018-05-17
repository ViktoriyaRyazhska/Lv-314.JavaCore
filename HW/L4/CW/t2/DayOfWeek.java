package t2;

public class DayOfWeek {

	public static String showDay(int day) {
		switch (day) {
		case 1:
			return "Sunday Нед1ля Воскресенье";
		case 2:
			return "Monday Понед1лок Понедельник";
		case 3:
			return "Thuesday В1второк Вторник";
		case 4:
			return "Wednesday Середа Среда";
		case 5:
			return "Thursday Четвер Четверг";
		case 6:
			return "Friday Пятниця Пятница";
		case 7:
			return "Saturday Субота Субота ";
		default:
			return "Error!";
		}

	}
}
