import java.util.ArrayList;

public class TestRiekert {
	public static void main(String[] args) {
		ArrayList<Riekert> riekerts = new ArrayList<Riekert>();
		Niels niels = new Niels(30, 185, "M", "Niels");
		Arne arne = new Arne(28, 193, "M", "Arne");
		Jon jon = new Jon(26, 194, "M", "Jon");
		Olle olle = new Olle(1, 100, "M", "Olle");
		Olle olle2 = new Olle();
		riekerts.add(niels);
		riekerts.add(arne);
		riekerts.add(jon);
		riekerts.add(olle);
		riekerts.add(olle2);
		for(int x = 0; x < riekerts.size(); x++){
			System.out.println(riekerts.get(x).getName() + "(" + riekerts.get(x).getGender() + ") is " + riekerts.get(x).getAge() + " jaar en " + riekerts.get(x).getLength() + "cm lang.");
			riekerts.get(x).introduce();
			riekerts.get(x).playInstrument();
		}
		System.out.println(arne.toString());
		System.out.println(arne.hashCode());
		System.out.println(arne.getClass());
		arne.hasJob(true);
	}
}

interface Musician {
	void playInstrument();
}

interface Job {
	void hasJob();
}

// Abstract superclass
abstract class Riekert implements Musician {
	private int age;
	private int length;
	private String gender;
	private String name;

	public Riekert(){
		// Roept een constructor aan om default args te geven aan de echte constructor
		this(42, 180, "M", "Riekert");
	}

	// De echte constructor
	public Riekert(int newAge, int newLength, String newGender, String newName){
		age = newAge;
		length = newLength;
		gender = newGender;
		name = newName;
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
}

class Niels extends Riekert {
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

class Arne extends Riekert {
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

class Jon extends Riekert {
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

class Olle extends Riekert {
	// Constructor
	public Olle(int age, int length, String gender, String name) {
		super(age, length, gender, name);
		System.out.println("Object Olle has been constructed on the heap.");
	}

	public Olle() {
		super();
		System.out.println("Object Olle has been constructed on the heap without arguments.");
	}

	public void introduce() {
		System.out.println("HEBBAH");
	}
	public void playInstrument() {
		System.out.println("DINGADONGDONG");
	}	
}