package state.ceilingfan;

public class LowFanState implements FanState {

	private CeilingFan ceilingFan;
	
	public LowFanState(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void pullGreen() {
		ceilingFan.setCurrentState(ceilingFan.getMediumFanState());
		System.out.println("medium speed");
	}

	@Override
	public void pullRed() {
		ceilingFan.setCurrentState(ceilingFan.getOffFanState());
		System.out.println("turning off");
	}

}
