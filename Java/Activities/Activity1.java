package activities;

public class Activity1 {
	
	public static void main() {
		// TODO Auto-generated method stub
		
		Car carName = new Car();
		carName.make = 2014;
		carName.color = "Black";
		carName.transmission = "Manual";
		
		carName.displayCharacteristics();
		carName.accelarate();
		carName.brake();

	}

}
