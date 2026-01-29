
public class Car {

	public String brand = "Audi";
	public String model = "A5";
	public int year = 2023;
	public int KM = 1000;
	public boolean EngineState = false;
	public int currentSpeed = 0;
	public int GearSituation = 0;

	public Car() {

	}

	public Car(String newbrand, String newmodel, int newyear, int newKilometer) {
		brand = newbrand;
		model = newmodel;
		year = newyear;
		KM = newKilometer;

	}

	public void RunEngine() {
		System.out.println(" Engine running. ");
	}

	public void StopEngine() {
		System.out.println(" Engine stopped. ");
	}

	public void SetSpeed(int newSpeed) {
		if (EngineState == true && newSpeed > 0 && newSpeed < 230) {
			currentSpeed = newSpeed;
			System.out.println("newSpeed" + newSpeed);
		} else {

		}
		System.out.println(" Newspeed is not between 0 and 230. ");

	}

	public int GetSpeed() {
		return currentSpeed;

	}

	public void GearUp() {
		if (EngineState == true && GearSituation > 6) {
			GearSituation++;
			System.out.println(" Gear is up now ");
		}
	}

	public void GearDown() {

		if (EngineState == true && GearSituation < 0) {
			GearSituation--;
			System.out.println(" Gear is down now: ");
		}
	}

}
