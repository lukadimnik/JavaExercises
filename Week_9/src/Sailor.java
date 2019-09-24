import java.util.ArrayList;

public class Sailor {

	private String name;
	private String email;

	public Sailor(String sailorName, String sailorEmail) {

		name = sailorName;
		this.email = sailorEmail;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String setEmail) {

		this.email = setEmail;

	}
}

class Crew {

	public ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

	public Crew() {

	}

	public void addCrewMember(Sailor sailor) {

		sailorList.add(sailor);

	}

	public String toString() {

		String toString = "";

		for (Sailor sailorObject : sailorList) {

			toString += sailorObject.getName() + " (" + sailorObject.getEmail() + ")\n";
		}

		return toString;
	}
}