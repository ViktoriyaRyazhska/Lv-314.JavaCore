package conditionalStatementsLW;

public class WeekDay {
	public static void printWeek(int DayNumber) {
		switch (DayNumber) {
		case 1:
			System.out.println("Monday Понеділок Понедельник");
			break;
		case 2:
			System.out.println("Tuesday Вівторок Вторник");
			break;
		case 3:
			System.out.println(" Wednesday  Середа Среда");
			break;
		case 4:
			System.out.println("Thursday Четвер Четверг");
			break;
		case 5:
			System.out.println("Friday Пятниця Пятница");
			break;
		case 6:
			System.out.println("Saturday Субота Суббота");
			break;
		case 7:
			System.out.println("Sunday Неділя Воскресенье");
			break;
		default:
			System.out.println("This is not a number of the weekday ");
			break;
		}
	}
}
