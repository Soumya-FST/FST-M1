package activities;

public class Activity6 {
	
	public static void main(String args[]) throws Exception {

		Plane plane = new Plane(10);
		plane.onboard("Soumya");
		plane.onboard("Suraj");
		
		System.out.println("Take off time - "+plane.takeOff());
		System.out.println("Passengers List - "+plane.getPassengers());
		
		Thread.sleep(5000);
		
		plane.land();
		System.out.println("Plane landed time: " + plane.getLastTimeLanded());
		
	}

}
