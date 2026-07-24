import java.util.Stack;

public class Invoker {
    private Stack<ICommand> commandHistory = new Stack<>();

    public void executeCommand(ICommand command) {
        command.execute();
        commandHistory.push(command);
    }
}
