// Arne is an object, not a class

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

	@Override
	public void introduce() {
		System.out.println("Hoi ik ben Arne.");
	}
	
	@Override
	public void playInstrument() {
		System.out.println("Hoi ik speel gitaar.");
	}
	
	@Override
	public void hasJob(boolean job) {
		if (job == true) {
			System.out.println(getName() + " heeft een baan.");
		} else {
			System.out.println(getName() + " heeft geen baan.");
		}
	}
}