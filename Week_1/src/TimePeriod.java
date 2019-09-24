
public class TimePeriod {
	private int hours;
	private int minutes;

	public TimePeriod() {
		hours = 0;
		minutes = 0;

	}

	public void addHours(int hoursToAdd) {

		if (hoursToAdd > 0 && (hours + hoursToAdd) <= 99) {
			hours += hoursToAdd;

		}
	}

	public void addMinutes(int minutesToAdd) {

		if (minutesToAdd >= 0 && minutesToAdd <= 59) {

			if ((minutes + minutesToAdd) == 60) {
				if (hours < 99) {
					hours++;
					minutes = 0;
				}
			} else if ((minutes + minutesToAdd) > 59) {
				if (hours < 99) {
					hours++;
					minutes = (minutes + minutesToAdd) - 60;
				}
			} else if ((minutes + minutesToAdd) < 60) {
					minutes += minutesToAdd;
			}
		}
	}

	public String toString() {

		return hours + " h " + minutes + " min";
	}

}