package command.remote;

import command.concrete_command.CeilingFanHighCommand;
import command.concrete_command.LightOnCommand;
import command.receiver.CeilingFan;
import command.receiver.Light;

public class SimpleRemoteControlTest {
	public static void main(String[] args) {
		Light light = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Kitchen");

		LightOnCommand lightOn = new LightOnCommand(light);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);

		SimpleRemoteControl remote = new SimpleRemoteControl();
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(ceilingFanHigh);
		remote.buttonWasPressed();
	}

}
