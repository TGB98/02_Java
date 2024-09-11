package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car{ // 전기차

	private int batteryCapacity; // 배터리용량
	
	public Tesla() {}
	
	// 매개변수 생성자 + 상속받은거 포함
		public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

		public int getBatteryCapacity() {
			return batteryCapacity;
		}

		public void setBatteryCapacity(int batteryCapacity) {
			this.batteryCapacity = batteryCapacity;
		}
	
		
		@Override
		public String toString() { // Car(부모)의 toString()
			return super.toString() + " / " + batteryCapacity;
		}
		
		
		
		
		
		
		
		
		
		
		
}
