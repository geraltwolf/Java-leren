public class Jon extends Riekert {
	// Constructor
	public Jon(int age, int length, String gender, String name) {
		super(age, length, gender, name);
		System.out.println("Object Jon has been constructed on the heap.");
	}

	public void introduce() {
		System.out.println("Hoi ik ben Jon.");
	}
	public void playInstrument() {
		System.out.println("Hoi ik speel viool.");
	}
}