
public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		}

	// Setters and Getters
	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return this.month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return this.day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void displayDate() {
		System.out.println(this.month + " / "  + this.day + " / " + this.year);
	}
	
	public boolean equals(Date date2) {
		if ( this.getMonth() == date2.getMonth() && this.getDay() == date2.getDay() && this.getYear() == date2.getYear() ) {
			return true;
		}
		return false;
	}

	public Date differenceDates(Date date2) {
		month_diff = this.getMonth() - date2.getMonth();
		day_diff = this.getDay() - date2.getDay();
		year_diff = this.getYear() - date2.getYear();

		return new Date(month_diff, day_diff, year_diff);
	}

	// MAIN
	public static void main(String[] args) {
		Date d1 = new Date(10, 1, 2020);
		Date d2 = new Date(10, 12, 2020);
		String x;
		d1.displayDate();
		System.out.println(d1.equals(d2));
	}	

}