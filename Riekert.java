// Abstract superclass
public abstract class Riekert implements Musician {
	private int age;
	private int length;
	private String gender;
	private String name;
	private static int riekertCount = 0;

	public Riekert(){
		// Roept een constructor aan om default args te geven aan de echte constructor
		this(42, 180, "M", "Riekert");
		riekertCount++;
	}

	// De echte constructor
	public Riekert(int newAge, int newLength, String newGender, String newName){
		age = newAge;
		length = newLength;
		gender = newGender;
		name = newName;
		riekertCount++;
	}

	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void setLength(int l) {
		length = l;
	}
	public int getLength() {
		return length;
	}
	public void setGender(String g) {
		gender = g;
	}
	public String getGender() {
		return gender;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void introduce() {
		System.out.println("Hoi ik ben een Riekert.");
	}
	public static int getriekertCount () {
		return riekertCount;
	}
}