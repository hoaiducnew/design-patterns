package state.ceilingfan;

public class CeilingFan {
	FanState offFanState;
	FanState lowFanState;
	FanState mediumFanState;
	FanState highFanState;

	FanState currentState;

	public CeilingFan() {
		super();
		
		offFanState = new OffFanState(this);
		lowFanState = new LowFanState(this);
		mediumFanState = new MediumFanState(this);
		highFanState = new HighFanState(this);
		
		currentState = offFanState;
	}

	public void pullGreen() {
		currentState.pullGreen();
	}

	public void pullRed() {
		currentState.pullRed();
	}

	public FanState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(FanState currentState) {
		this.currentState = currentState;
	}

	public FanState getOffFanState() {
		return offFanState;
	}

	public void setOffFanState(FanState offFanState) {
		this.offFanState = offFanState;
	}

	public FanState getLowFanState() {
		return lowFanState;
	}

	public void setLowFanState(FanState lowFanState) {
		this.lowFanState = lowFanState;
	}

	public FanState getMediumFanState() {
		return mediumFanState;
	}

	public void setMediumFanState(FanState mediumFanState) {
		this.mediumFanState = mediumFanState;
	}

	public FanState getHighFanState() {
		return highFanState;
	}

	public void setHighFanState(FanState highFanState) {
		this.highFanState = highFanState;
	}

}
