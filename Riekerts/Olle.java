public class Olle extends Riekert {
	// Constructor
	private static int olleCount = 0;
	public Olle(int age, int length, String gender, String name) {
		super(age, length, gender, name);
		System.out.println("Object Olle has been constructed on the heap.");
		olleCount++;
	}

	public Olle() {
		super();
		System.out.println("Object Olle has been constructed on the heap without arguments.");
		olleCount++;
	}

	public void introduce() {
		System.out.println("HEBBAH");
	}
	public void playInstrument() {
		System.out.println("DINGADONGDONG");
	}
	public int getolleCount() {
		return olleCount;
	}
}