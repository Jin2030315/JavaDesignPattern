package command.pattern.demo;

public class Invoke {
	ICommand iCommand;
	
	/**
	 * 
	 * @param iCommand
	 */
	public void ExecuteCommand(ICommand iCommand){
		
		this.iCommand = iCommand;
		iCommand.Do();
	}
}
