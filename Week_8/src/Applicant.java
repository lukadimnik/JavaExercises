public class Applicant {

	private String name;
	private int points;

	public Applicant(String applicantsName, int applicantsPoints) {
		name = applicantsName;
		points = applicantsPoints;
	}

	public String getName() {
		return name;

	}

	public int getPoints() {
		return points;
	}
}