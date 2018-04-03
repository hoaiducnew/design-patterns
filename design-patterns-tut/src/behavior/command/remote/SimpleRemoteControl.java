package behavior.command.remote;

import behavior.command.concrete_command.Command;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
