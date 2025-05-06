// The editor class has actual text editing operations. It plays
// the role of a receiver: all commands end up delegating
// execution to the editor's methods.
public class Editor {
    private String text="";

    public String getText() {
        // Return selected text.
        return text;
    }

    public void deleteText() {
        // Delete selected text.
        text= "";
    }

    public void replaceText(String text) {
        // Insert the clipboard's contents at the current
        // position.
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void appendText(String text) {
        this.text += text;
    }
}