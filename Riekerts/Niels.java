public class Niels extends Riekert {
	// Constructor
	public Niels(int age, int length, String gender, String name) {
		super(age, length, gender, name);
		System.out.println("Object Niels has been constructed on the heap.");
	}

	public void introduce() {
		super.introduce();
		System.out.println("Hoi ik ben Niels.");
	}
	public void playInstrument() {
		System.out.println("Hoi ik speel computer.");
	}
}