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
		System.out.println(olle.getolleCount());
		System.out.println(olle.getriekertCount());
	}
}