package behavior.command.remote;

import behavior.command.concrete_command.CeilingFanHighCommand;
import behavior.command.concrete_command.LightOnCommand;
import behavior.command.receiver.CeilingFan;
import behavior.command.receiver.Light;

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
