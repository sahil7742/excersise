package classes1;

import java.util.Scanner;


public class hello {

	public static void main(String[] args) {
		System.out.println(" speed ");

		
		Scanner input = new Scanner(System.in);
		Car car = new Car();
		int speed = input.nextInt();
		
		car.setspeed(speed);
		car.setengine("on");
		car.settemprature(100.45);
		car.setalcoholic(false);
		car.setChallan(100.5565);
		car.run();

		System.out.println("speed " + car.getspeed());
		System.out.println("engine " + car.getengine());
	    System.out.println("temprature of engine " + car.gettemprature());
		System.out.println("driver drunked " + car.getalcoholic());
		System.out.println("challan on car " + car.getChallan());
		System.out.println(car.run());

	}

}
