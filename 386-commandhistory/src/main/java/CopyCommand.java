// The concrete commands go here.
public class CopyCommand extends Command {
    public CopyCommand(Application app) {
        super(app);
    }

    // The copy command isn't saved to the history since it
    // doesn't change the editor's state.
    public boolean execute() {
        //todo:add code here
        // 保存备份并将文本复制到剪贴板
        return false; // 不将此命令保存到历史记录
    }

    public void undo() {
        //todo:add code here
        // 从备份恢复文本
    }
}