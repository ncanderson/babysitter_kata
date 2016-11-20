package nate.anderson.babysitter_kata;

import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import nate.anderson.babysitter_kata.model.SittingShift;

public class SittingShiftTest {
	
	SittingShift testShift;
	LocalTime testTime = LocalTime.of(20, 0);
	
	@Before
	public void setUp() {
		testShift = new SittingShift();
	}
	
	@Test
	public void sittingShiftStoresStartTime() {
		testShift.setShiftStartTime(LocalTime.of(17, 0));
		Assert.assertEquals(LocalTime.of(17, 0), testShift.getShiftStartTime());
	}
	
	@Test 
	public void sittingShiftStoresEndTime() {
		testShift.setShiftEndTime(LocalTime.of(3, 0));
		LocalTime testEndTime = LocalTime.of(3, 0);
		Assert.assertEquals(testShift.getShiftEndTime(), testEndTime);
	}
	
	@Test 
	public void sittingShiftStoresBedTime() {
		testShift.setBedtime(LocalTime.of(22, 0));
		LocalTime testBedtime = LocalTime.of(22, 0);
		Assert.assertEquals(testShift.getBedtime(), testBedtime);
	}
	
	@Test  
	public void sittingShiftStoresAnotherBedTime() {
		testShift.setBedtime(LocalTime.of(3, 0));
		LocalTime testBedtime = LocalTime.of(3, 0);
		Assert.assertEquals(testShift.getBedtime(), testBedtime);
	}
	
	@Test 
	public void settingDifferentTimesForShiftStart() {
		testShift.setShiftStartTime(LocalTime.of(22, 0));
		LocalTime testStartTime = LocalTime.of(22, 0);
		Assert.assertEquals(testShift.getShiftStartTime(), testStartTime);
	}

	@Test  
	public void settingDifferentTimesForShiftEnd() {
		testShift.setShiftEndTime(LocalTime.of(3, 0));
		Assert.assertEquals(LocalTime.of(3, 0), testShift.getShiftEndTime());
	}
	
	@Test
	public void timeInputIsStoredIn24HourTime() {
		testShift.setShiftStartTime(LocalTime.of(17, 0));
		Assert.assertEquals(LocalTime.of(17, 0), testShift.getShiftStartTime());
	}
	
	@Test
	public void sittingShiftPackagesAllTimes() {
		Assert.assertEquals(3, testShift.getAllTimes().size());
	}
	
	@Test 
	public void allTimesCanBeSetAtOnce() {
		testShift.setAllTimes(testTime, testTime, testTime);
		Assert.assertEquals(testTime, testShift.getShiftStartTime());
		Assert.assertEquals(testTime, testShift.getBedtime());
		Assert.assertEquals(testTime, testShift.getShiftEndTime());
	}

}
