package state.ceilingfan;

public class HighFanState implements FanState {

	private CeilingFan ceilingFan;
	
	public HighFanState(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void pullGreen() {
		ceilingFan.setCurrentState(ceilingFan.getOffFanState());
		System.out.println("turning off");
	}

	@Override
	public void pullRed() {
		ceilingFan.setCurrentState(ceilingFan.getMediumFanState());
		System.out.println("medium speed");
	}

}
