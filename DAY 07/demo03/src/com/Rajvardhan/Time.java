package com.Rajvardhan;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) throws CustomException {
		if (hours < 0 || hours > 24) {
			throw new CustomException("Hours", hours);

		} else
			this.hours = hours;

		if (minutes < 0 || minutes > 60) {
			throw new CustomException("Minutes",minutes);
		} else
			this.minutes = minutes;

		if (seconds < 0 || seconds > 60) {
			throw new CustomException("Seconds",seconds);
		} else
			this.seconds = seconds;
	}

	public void displayRecords() {
		System.out.println("Hours   :" + this.hours);
		System.out.println("Minutes :" + this.minutes);
		System.out.println("Seconds :" + this.seconds);
	}

}
