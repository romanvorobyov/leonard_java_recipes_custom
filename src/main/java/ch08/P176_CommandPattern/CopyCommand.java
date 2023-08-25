package ch08.P176_CommandPattern;

public class CopyCommand implements Command {

    private final IODevice action;
  
    public CopyCommand(IODevice action) {
        this.action = action;    
    }

    @Override
    public void execute() {
        action.copy();
    }

}
