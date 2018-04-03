package behavior.command.concrete_command;

import behavior.command.receiver.Light;

public class LightOffCommand implements Command {
	Light light;
	int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.off();
	}
 
	public void undo() {
		light.dim(level);
	}
}
