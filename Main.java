import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
	
		System.out.print(findDay(2021, 4, 14));
	}
	
	public static String findDay(int year, int month, int day) {
		LocalDate localDate = LocalDate.of(year, month, day);
		
		java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		
		return dayOfWeek.toString();
		
	}
}
