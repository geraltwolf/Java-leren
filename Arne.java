public class Arne extends Riekert implements Job {
	public static final int YEAR_OF_BIRTH;

	static  {
		YEAR_OF_BIRTH = 1988;
	}
	
	// Constructor
	public Arne(int age, int length, String gender, String name) {
		super(age, length, gender, name);
		System.out.println("Object Arne has been constructed on the heap.");
	}

	public void introduce() {
		System.out.println("Hoi ik ben Arne.");
	}
	
	public void playInstrument() {
		System.out.println("Hoi ik speel gitaar.");
	}
	
	public void hasJob(boolean job) {
		if (job == true) {
			System.out.println(getName() + " heeft een baan.");
		} else {
			System.out.println(getName() + " heeft geen baan.");
		}
	}
}