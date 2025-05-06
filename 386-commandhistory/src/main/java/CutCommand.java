public class CutCommand extends Command {
    public CutCommand(Application app) {
        super(app);
    }

    // The cut command does change the editor's state, therefore
    // it must be saved to the history. And it'll be saved as
    // long as the method returns true.
    public boolean execute() {
        // 保存备份并将文本复制到剪贴板，然后删除所有文本
        //todo:add code here

        return true;
    }
}