package state.ceilingfan;

public class OffFanState implements FanState {

	private CeilingFan ceilingFan;
	
	public OffFanState(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void pullGreen() {
		ceilingFan.setCurrentState(ceilingFan.getLowFanState());
		System.out.println("low speed");
	}

	@Override
	public void pullRed() {
		ceilingFan.setCurrentState(ceilingFan.getHighFanState());
		System.out.println("high speed");
	}

}
