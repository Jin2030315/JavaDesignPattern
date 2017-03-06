package command.pattern.demo;

public class CommandPatternEx {

	/***
	 * 1.This pattern is widely used for undo/redo operations.
	 * 2.A callback function can be designed with this pattern.
	 * 3.This pattern is very useful when we model transactions (which can be responsible for changes in data)
	 * 4.There is another pattern called chain of responsibility. There we forward a request along a chain of objects with 
	 *   the hope that any one of the objects along that chain will handle the request. But in command pattern. we'll forward
	 *   the request to the specific object.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("***Command Pattern Demo***\n");
		Receiver intendedreceiver = new Receiver();
		/*Client holds Invoker and Command Objects*/
		Invoke inv = new Invoke();
		MyUndoCommand undoCommand = new MyUndoCommand(intendedreceiver);
		MyRedoCommand redoCommand = new MyRedoCommand(intendedreceiver);
		inv.ExecuteCommand(undoCommand);
		inv.ExecuteCommand(redoCommand);
	}

}
