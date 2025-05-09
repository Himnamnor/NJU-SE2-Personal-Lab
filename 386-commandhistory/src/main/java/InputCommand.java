public class InputCommand extends Command{
    public InputCommand(Application app, String input) {
        super(app,input);
    }



    @Override
    public boolean execute() {
        //todo:add code here
        saveBackup();
        app.getEditor().appendText(app.input);
        return true;

    }

}
