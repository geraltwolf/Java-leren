import java.util.ArrayList;

public class TestRiekert {
	public static void main(String[] args) {
		ArrayList<Riekert> riekerts = new ArrayList<Riekert>();
		Niels niels = new Niels();
		Arne arne = new Arne();
		Jon jon = new Jon();
		Olle olle = new Olle();
		niels.setAge(30);
		niels.setLength(185);
		niels.setGender("M");
		niels.setName("Niels");
		arne.setAge(28);
		arne.setLength(193);
		arne.setGender("M");
		arne.setName("Arne");
		jon.setAge(26);
		jon.setLength(194);
		jon.setGender("M");
		jon.setName("Jon");
		olle.setAge(1);
		olle.setLength(100);
		olle.setGender("M");
		olle.setName("Olle");
		riekerts.add(niels);
		riekerts.add(arne);
		riekerts.add(jon);
		riekerts.add(olle);
		for(int x = 0; x < riekerts.size(); x++){
			System.out.println(riekerts.get(x).getName() + "(" + riekerts.get(x).getGender() + ") is " + riekerts.get(x).getAge() + " jaar en " + riekerts.get(x).getLength() + "cm lang.");
			riekerts.get(x).introduce();
		}
	}
}

abstract class Riekert {
	private int age;
	private int length;
	private String gender;
	private String name;
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
	public void introduce() {
		System.out.println("Hoi ik ben een Riekert.");
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
}

class Niels extends Riekert {
	public void introduce() {
		super.introduce();
		System.out.println("Hoi ik ben Niels.");
	}
}

class Arne extends Riekert {
	public void introduce() {
		System.out.println("Hoi ik ben Arne.");
	}
}

class Jon extends Riekert {
	public void introduce() {
		System.out.println("Hoi ik ben Jon.");
	}
}

class Olle extends Riekert {
	public void introduce() {
		System.out.println("HEBBAH");
	}	
}