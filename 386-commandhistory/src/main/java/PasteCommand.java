public class PasteCommand extends Command {
    public PasteCommand(Application app) {
        super(app);
    }

    public boolean execute() {
        // 保存备份并将剪贴板文本追加到编辑器
        //todo:add code here
        saveBackup();
        app.getEditor().appendText(app.getClipboard());
        return true;// 不将此命令保存到历史记录
    }
}