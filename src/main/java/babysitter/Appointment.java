package babysitter;

public class Appointment {

	private double startTime; //Eclipse had me add static here not sure why
	private double bedTime; //Eclipse had me add static here not sure why
	private double endTime; //Eclipse had me add static here not sure why


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
		this.startTime = startTime;
		this.bedTime = bedTime;
		this.endTime = endTime;
	}
	
	//Eclipse had me add static here not sure why
	public double calculatePay() {
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
