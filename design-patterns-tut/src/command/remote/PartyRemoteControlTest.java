package command.remote;

import command.concrete_command.CeilingFanHighCommand;
import command.concrete_command.CeilingFanOffCommand;
import command.concrete_command.Command;
import command.concrete_command.LightOffCommand;
import command.concrete_command.LightOnCommand;
import command.concrete_command.MacroCommand;
import command.receiver.CeilingFan;
import command.receiver.Light;

public class PartyRemoteControlTest {

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

		Command[] partyOn = { livingRoomLightOn, kitchenLightOn, ceilingFanHigh };
		Command[] partyOff = { livingRoomLightOff, kitchenLightOff, ceilingFanOff };
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		PartyRemoteControl remoteControl = new PartyRemoteControl();
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
