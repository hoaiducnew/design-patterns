package behavior.command.remote;

import behavior.command.concrete_command.CeilingFanHighCommand;
import behavior.command.concrete_command.CeilingFanOffCommand;
import behavior.command.concrete_command.LightOffCommand;
import behavior.command.concrete_command.LightOnCommand;
import behavior.command.receiver.CeilingFan;
import behavior.command.receiver.Light;

public class RemoteControlTest {

	public static void main(String[] args) {
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.onButtonWasPushed(5);
		remoteControl.offButtonWasPushed(5);
		remoteControl.onButtonWasPushed(6);
		remoteControl.offButtonWasPushed(6);
	}
}
