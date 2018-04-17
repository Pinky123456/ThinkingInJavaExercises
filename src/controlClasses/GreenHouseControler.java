package controlClasses;

public class GreenHouseControler {
	public static void greenHC_test(String[] args){
		GreenHouseControls gc = new GreenHouseControls();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(0),
				gc.new LightOff(0),
				gc.new WaterOn(0),
				gc.new WaterOff(0),
				gc.new ThermostatDay(0),
		};
		gc.addEvent(gc.new Restart(2000,eventList));
		//gc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
		gc.run();
	}
}
