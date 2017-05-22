public class CarSpeedMeter extends SpeedMeter{
	public double getRadius(){
		return 0.28;
	}
	public static void main(String[] args){
		CarSpeedMeter car = new CarSpeedMeter();
		car.setTurnRate(3);
		System.out.println(car.getSpeed());
	}
}