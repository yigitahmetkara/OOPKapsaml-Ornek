
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car Car1 = new Car();
		System.out.println(" Car 1 detail: ");
		System.out.println();
		System.out.println(" car1.brand" + Car1.brand + " car1.model " + Car1.model + "car1.year " + Car1.year
				+ "car1.Km" + Car1.KM);

		Car1.RunEngine();
		Car1.GearUp();
		Car1.SetSpeed(120);
		Car1.GetSpeed();
		Car1.GearDown();
		Car1.StopEngine();

	}

}
