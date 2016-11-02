import java.util.ArrayList;

public class TestRiekert {
	public static void main(String[] args) {
		System.out.println(Arne.YEAR_OF_BIRTH);
		ArrayList<Riekert> riekerts = new ArrayList<Riekert>();
		System.out.println(Riekert.getriekertCount());
		Niels niels = new Niels(30, 185, "M", "Niels");
		System.out.println(Riekert.getriekertCount());
		Arne arne = new Arne(28, 193, "M", "Arne");
		System.out.println(Riekert.getriekertCount());
		Jon jon = new Jon(26, 194, "M", "Jon");
		System.out.println(Riekert.getriekertCount());
		Olle olle = new Olle(1, 100, "M", "Olle");
		System.out.println(Riekert.getriekertCount());
		Olle olle2 = new Olle();
		System.out.println(Riekert.getriekertCount()); // Because of .this olle2 runs two constructors, which is why it adds 2 to the count
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
		System.out.println(olle.getolleCount()); // Returns the amount of olle instances created, because of the static variable ++ in the constructor
	}
}