// The concrete commands go here.
public class CopyCommand extends Command {
    public CopyCommand(Application app) {
        super(app);
    }

    private String backup; // 备份文本
    // The copy command isn't saved to the history since it
    // doesn't change the editor's state.
    public boolean execute() {
        //todo:add code here
        // 保存备份并将文本复制到剪贴板
        backup=app.getEditor().getText();
        app.clipboard=app.getEditor().getText();
        return false; // 不将此命令保存到历史记录
    }

    public void undo() {
        //todo:add code here
        // 从备份恢复文本
        app.getEditor().setText(backup);
    }
}