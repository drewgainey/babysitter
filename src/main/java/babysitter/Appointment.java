package babysitter;

public class Appointment {

	private static double startTime; //Eclipse had me add static here not sure why
	private static double bedTime; //Eclipse had me add static here not sure why
	private static double endTime; //Eclipse had me add static here not sure why


	public double getStartTime() {
		return startTime;
	}

	public double getBedTime() {
		return bedTime;
	}

	public double getEndTime() {
		return endTime; 
	}

	public Appointment(double startTime, double bedTime, double endTime) {
		Appointment.startTime = startTime;
		Appointment.bedTime = bedTime;
		Appointment.endTime = endTime;
	}
	
	//Eclipse had me add static here not sure why
	public static double calculatePay() {
		double timeTillBed = bedTime - startTime;
		double timeTillMidNight = 24 - bedTime;
		double timeTillEnd = endTime;
		double overTime = (timeTillBed + timeTillMidNight + timeTillEnd) % 1;
		if ( endTime > 4) {
			timeTillMidNight = endTime - bedTime; 
			timeTillEnd = 0;
		}

		double pay = (timeTillBed * 12) + (timeTillMidNight * 8) + ((timeTillEnd + overTime) * 16);
		
		return pay;
		
	}
}
