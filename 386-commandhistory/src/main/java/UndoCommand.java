// The undo operation is also a command.
public class UndoCommand extends Command {
    public UndoCommand(Application app) {
        super(app);
    }

    public boolean execute() {
        // 调用Application的undo方法
        //todo:add code here
        app.undo();
        return false; // 不将此命令保存到历史记录
    }
}
