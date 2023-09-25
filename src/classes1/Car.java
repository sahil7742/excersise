package classes1;

public class Car {
	
	
	private double temprature;
	private String engine;
	private boolean alcoholic;
	private int speed;
	private double challan;
    // constructor using manual input
	public Car() {
		temprature = 100.30;
		engine = "on";
		alcoholic = false;
		speed = 10;
		challan = 10000;
		
	}
	
// constructor from source
	public Car(double temprature, String engine, boolean alcoholic, int speed, double challan) {
		
		this.temprature = temprature;
		this.engine = engine;
		this.alcoholic = alcoholic;
		this.speed = speed;
		this.challan = challan;
	}


	public void setspeed(int speed) {
		this.speed = 5 * speed;
	}

	public int getspeed() {
		return speed;
	}

	public void setengine(String engine) {
		this.engine = engine;
	}

	public String getengine() {
		return engine;

	}

	public void settemprature(double temprature) {
		this.temprature = temprature;
	}

	public double gettemprature() {
		return temprature;
	}

	public void setalcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}

	public boolean getalcoholic() {
		return alcoholic;
	}

	public double getChallan() {
		return challan;
	}

	public void setChallan(double challan) {
		this.challan = challan;
	}
	public String run() {
		if(engine.equals("on")||speed>0|| challan<500|| temprature<100.5||alcoholic==false||engine=="on"){
			return "running";
		}
		else 
			return "not running";
		
		}
	

}
