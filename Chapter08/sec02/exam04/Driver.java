package sec02.exam04;

import sec02.exam03.Vehicle;
import sec02.exam03.Bus;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus=(Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
