package Practice;

public class Main {
	
	String carColor, carName;
	int carModelYear;
	  
	public static void main(String[] args) {

	  
	  Main car1=new Main();
	  car1.carColor = "BLACK";
	  car1.carModelYear=2019;
	  car1.carName="BMW";
	  System.out.println("Car color is "+ car1.carColor +" and car model year is "+ car1.carModelYear +" and car name is "+car1.carName);

      Main car2=new Main();
      car2.carColor="White";
      car2.carModelYear=2018;
      car2.carName="Toyota";
      System.out.println("Car color is "+ car2.carColor +" and car model year is "+ car2.carModelYear +" and car name is "+car2.carName);

		}

}
