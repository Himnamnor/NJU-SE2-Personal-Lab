public abstract class Command {
    protected Application app;
    protected String backup="";

    protected String input="";

    public Command(Application app) {
        this.app = app;

    }
    public Command(Application app,String s) {
        this.app = app;
        this.input = s;
    }


    // Make a backup of the editor's state.
    public void saveBackup() {
        // 实现保存备份的逻辑
        //todo:add code here
        app.backup.push(app.getEditor().getText());
    }

    // Restore the editor's state.
    public void undo() {
        // 实现恢复编辑器状态的逻辑
        //todo:add code here
        if(!app.backup.isEmpty()) {
            String lastBackup = app.backup.pop();
            app.getEditor().setText(lastBackup);
        }
    }

    // The execution method is declared abstract to force all
    // concrete commands to provide their own implementations.
    // The method must return true or false depending on whether
    // the command changes the editor's state.
    public abstract boolean execute();

}