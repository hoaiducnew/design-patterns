package state.ceilingfan;

public class MediumFanState implements FanState {

	private CeilingFan ceilingFan;
	
	public MediumFanState(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void pullGreen() {
		ceilingFan.setCurrentState(ceilingFan.getHighFanState());
		System.out.println("high speed");
	}

	@Override
	public void pullRed() {
		ceilingFan.setCurrentState(ceilingFan.getLowFanState());
		System.out.println("low speed");
	}

}
