package babysitter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void shouldRenderObjectProperties() {
		Appointment underTest = new Appointment(17, 24, 4);
		double startTime = underTest.getStartTime();
		double bedTime = underTest.getBedTime();
		double endTime = underTest.getEndTime();
		assertEquals(17, startTime, .1);
		assertEquals(24, bedTime, .1);
		assertEquals(4, endTime, .1);
	}

	@Test
	public void shouldCalculatePay() {
		Appointment underTest = new Appointment(17, 24, 4);
		double pay = underTest.calculatePay(); //unsure about the warning
		assertEquals(148, pay, .1);
	}

	@Test
	public void shouldRoundTotalHoursUpToNextWhole() {
		Appointment underTest = new Appointment(17.5, 24, 4);
		double pay = underTest.calculatePay(); //unsure about the warning
		assertEquals(150, pay, .1);
	}
	
	@Test 
	public void shouldCalculateWhenLeaveBeforeMidnight() {
		Appointment underTest = new Appointment(17,20,22);
		double pay = underTest.calculatePay(); //unsure about the warning
		assertEquals(52, pay, .1);
	}


}
