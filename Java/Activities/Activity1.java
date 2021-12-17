package activities;

public class Activity1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Car BMW = new Car();
		
		BMW.make = 2014;
		BMW.color = "Black";
		BMW.transmission = "Manual";
		
		
		BMW.displayCharacterstics();
		BMW.accelerate();
		BMW.brake();
	}

}
