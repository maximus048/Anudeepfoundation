/*
1.Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.

code:
package Practice;


class HillStations {

	void location() {
		System.out.println("Location of Hill Station");
	}

	void famousFor() {
		System.out.println("Famous for");
	}
}


class Manali extends HillStations {

	@Override
	void location() {
		System.out.println("Manali is located in Himachal Pradesh");
	}

	@Override
	void famousFor() {
		System.out.println("Manali is famous for Snow and Adventure Activities");
	}
}

class Mussoorie extends HillStations {

	@Override
	void location() {
		System.out.println("Mussoorie is located in Uttarakhand");
	}

	@Override
	void famousFor() {
		System.out.println("Mussoorie is famous for Scenic Beauty");
	}
}


class Gulmarg extends HillStations {

	@Override
	void location() {
		System.out.println("Gulmarg is located in Jammu and Kashmir");
	}

	@Override
	void famousFor() {
		System.out.println("Gulmarg is famous for Skiing");
	}


	public static void main(String[] args) {

		// i) Calling using Parent class reference (Runtime Polymorphism)
		HillStations hs= new HillStations();

		hs = new Manali();
		hs.location();
		hs.famousFor();

		hs = new Mussoorie();
		hs.location();
		hs.famousFor();

		hs = new Gulmarg();
		hs.location();
		hs.famousFor();

		System.out.println("-------------------------");

		// ii) Calling using Subclass objects directly
		Manali m = new Manali();
		m.location();
		m.famousFor();

		Mussoorie mu = new Mussoorie();
		mu.location();
		mu.famousFor();

		Gulmarg g = new Gulmarg();
		g.location();
		g.famousFor();
	}
}




output:
Manali is located in Himachal Pradesh
Manali is famous for Snow and Adventure Activities
Mussoorie is located in Uttarakhand
Mussoorie is famous for Scenic Beauty
Gulmarg is located in Jammu and Kashmir
Gulmarg is famous for Skiing
-------------------------
Manali is located in Himachal Pradesh
Manali is famous for Snow and Adventure Activities
Mussoorie is located in Uttarakhand
Mussoorie is famous for Scenic Beauty
Gulmarg is located in Jammu and Kashmir
Gulmarg is famous for Skiing



*/