public class BackspaceCommand extends Command{
    public BackspaceCommand(Application app) {
        super(app);
    }

    @Override
    public boolean execute() {
        // 保存备份并删除所有文本
        //todo:add code here
        saveBackup();
        app.getEditor().deleteText();
        return true; // 告诉历史记录要保存此命令
    }
}
