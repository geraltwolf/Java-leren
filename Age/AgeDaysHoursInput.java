import java.util.Calendar;
import java.util.Locale;

public class AgeDaysHoursInput {
	public static void main(String[] args) {
		String n = args[0];
		int a = Integer.parseInt(args[1]), b = Integer.parseInt(args[2]), c = Integer.parseInt(args[3]);

		Locale.setDefault(new Locale("nl", "NL"));

		Calendar calCurrent = Calendar.getInstance();
		System.out.println("Het is nu " + String.format("%tA %<td %<tB %<tY", calCurrent.getTime()) + ".");

		Person input = new Person(n, a, b, c);

		System.out.println("Het is " + input.daysDifference(input.setCalendar(input.getYear(), input.getMonth(), input.getDay()), calCurrent) + " dagen geleden dat " + input.getName() + " is geboren.");
		System.out.println("Het is " + input.hoursDifference(input.setCalendar(input.getYear(), input.getMonth(), input.getDay()), calCurrent) + " uren geleden dat " + input.getName() + " is geboren.");
	}
}