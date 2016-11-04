import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Person {
	private String name;
	private int year;
	private int month;
	private int day;
	public Person (String newName, int newYear, int newMonth, int newDay) {
		name = newName;
		year = newYear;
		month = newMonth - 1;
		day = newDay;
	}

	public String getName () {
		return name;
	}

	public int getYear () {
		return year;
	}

	public int getMonth () {
		return month;
	}

	public int getDay () {
		return day;
	}

	public Calendar setCalendar(int y, int m, int d) {
		Calendar calPerson = Calendar.getInstance();
		calPerson.set(y,m,d);
		System.out.println(name + " is geboren op " + String.format("%tA %<td %<tB %<tY", calPerson.getTime()));
		return calPerson;
	}

	public long daysDifference (Calendar date1, Calendar date2) {
		long firstDate = date1.getTimeInMillis();
		long secondDate = date2.getTimeInMillis();
		long dif = TimeUnit.MILLISECONDS.toDays(Math.abs(firstDate - secondDate));
		return dif;
	}

	public long hoursDifference (Calendar date1, Calendar date2) {
		long firstDate = date1.getTimeInMillis();
		long secondDate = date2.getTimeInMillis();
		long dif = TimeUnit.MILLISECONDS.toHours(Math.abs(firstDate - secondDate));
		return dif;
	}
}