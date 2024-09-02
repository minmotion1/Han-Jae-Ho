package a240902;

class Car{
	
	public int speed;
	public int mileage;
	public String color;
	
	public void speedUp() {
		speed += 10;
	}
	public void speedDown() {
		speed -= 10;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.speed=60;
		myCar.mileage=0;
		myCar.color = "blue";
		
		myCar.speedUp();
		
		yourCar.speed = 120;
		yourCar.mileage=10;
		yourCar.color="white";
		
		yourCar.speedDown();
		
	}

}
