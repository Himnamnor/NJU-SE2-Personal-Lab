
public class Application {
    String clipboard = "";

    String input = "";

    Editor activeEditor = new Editor();

    Button copyButton = new Button("Copy");
    Button cutButton = new Button("Cut");
    Button pasteButton = new Button("Paste");
    Button undoButton = new Button("Undo");

    Button inputButton = new Button("Input");

    Button backspaceButton = new Button("Backspace");

    CommandHistory history = new CommandHistory();


    public  Application() {

        // ...
        copyButton.setOnClick(() -> executeCommand(new CopyCommand(this)));


        cutButton.setOnClick(() -> executeCommand(new CutCommand(this)));


        pasteButton.setOnClick(() -> executeCommand(new PasteCommand(this)));


        undoButton.setOnClick(() -> executeCommand(new UndoCommand(this)));

        inputButton.setOnClick(() -> executeCommand(new InputCommand(this,input)));

        backspaceButton.setOnClick(() -> executeCommand(new BackspaceCommand(this)));

    }


    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }


    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public Editor getEditor() {
        return activeEditor;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setInput(String s) {
        this.input = s;
    }

    public String getInput() {
        return this.input;
    }
}