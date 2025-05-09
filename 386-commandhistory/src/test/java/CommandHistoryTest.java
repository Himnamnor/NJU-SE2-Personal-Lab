import org.junit.Test;

import java.util.Arrays;


import static org.junit.Assert.assertEquals;
public class CommandHistoryTest {
    @Test
    public void test1(){
        //test input
        Application app = new Application();
        app.setInput("123");
        app.inputButton.click();


        assertEquals("123",app.getEditor().getText());

    }

    @Test
    public void test2(){
        //test input and copy
        Application app = new Application();
        app.setInput("123");
        app.inputButton.click();

        app.copyButton.click();


        assertEquals("123",app.getClipboard());

    }

    @Test
    public void test3(){
        //test input and copy and paste
        Application app = new Application();
        app.setInput("123");
        app.inputButton.click();

        app.copyButton.click();

        app.pasteButton.click();

        assertEquals("123123",app.getEditor().getText());


    }

    @Test
    public void test4(){
        //test input and copy and input and paste
        Application app = new Application();

        app.setInput("123");
        app.inputButton.click();

        app.copyButton.click();

        app.setInput("456");
        app.inputButton.click();

        app.pasteButton.click();

        assertEquals("123456123",app.getEditor().getText());


    }

    @Test
    public void test5(){
        //test input and copy and input and paste and undo
        Application app = new Application();

        app.setInput("123");
        app.inputButton.click();

        app.copyButton.click();

        app.setInput("456");
        app.inputButton.click();

        app.pasteButton.click();

        app.undoButton.click();

        assertEquals("123456",app.getEditor().getText());
    }

    @Test
    public void test6(){
        //test input and cut and input and paste
        Application app = new Application();

        app.setInput("123");
        app.inputButton.click();

        app.cutButton.click();

        app.setInput("456");
        app.inputButton.click();

        app.pasteButton.click();

        assertEquals("456123",app.getEditor().getText());


    }

    @Test
    public void test7(){
        //test input and backspace
        Application app = new Application();

        app.setInput("123");
        app.inputButton.click();

        app.backspaceButton.click();

        assertEquals("",app.getEditor().getText());


    }

    @Test
    public void test8(){
        //test input and backspace
        Application app = new Application();

        app.setInput("1234567");
        app.inputButton.click();

        app.setInput("123");
        app.inputButton.click();

        app.backspaceButton.click();



        assertEquals("",app.getEditor().getText());


    }

    @Test
    public void test9(){
        //test input and backspace and undo
        Application app = new Application();

        app.setInput("123");
        app.inputButton.click();

        assertEquals("123",app.getEditor().getText());

        app.backspaceButton.click();

        assertEquals("",app.getEditor().getText());

        app.undoButton.click();



        assertEquals("123",app.getEditor().getText());


    }

    @Test
    public void test10(){

        //test input and backspace and undo
        Application app = new Application();

        app.setInput("123");
        app.inputButton.click();

        assertEquals("123",app.getEditor().getText());

        app.backspaceButton.click();

        assertEquals("",app.getEditor().getText());

        app.undoButton.click();

        app.undoButton.click();

        assertEquals("",app.getEditor().getText());


    }

    @Test
    public void test11(){

        Application app = new Application();
        app.setInput("123");
        app.inputButton.click();

        app.copyButton.click();

        app.pasteButton.click();

        assertEquals("123123",app.getEditor().getText());

        app.undoButton.click();

        assertEquals("123",app.getEditor().getText());
        assertEquals("123",app.getClipboard());


    }

    @Test
    public void test12(){
        Application app = new Application();
        app.setInput("123");
        app.inputButton.click();

        app.copyButton.click();

        app.pasteButton.click();

        assertEquals("123123",app.getEditor().getText());

        app.undoButton.click();

        assertEquals("123",app.getEditor().getText());
        assertEquals("123",app.getClipboard());

        app.undoButton.click();

        assertEquals("",app.getEditor().getText());
//        assertEquals("123",app.getClipboard());


    }

    @Test
    public void testUndoRedo() {
        Application app = new Application();

        app.setInput("123");
        app.inputButton.click();

        app.setInput("456");
        app.inputButton.click();

        app.setInput("789");
        app.inputButton.click();

        assertEquals("123456789", app.getEditor().getText());

        app.undoButton.click();
        assertEquals("123456", app.getEditor().getText());

        app.undoButton.click();
        assertEquals("123", app.getEditor().getText());

        app.undoButton.click();
        assertEquals("", app.getEditor().getText());

        app.undoButton.click();
        assertEquals("", app.getEditor().getText());

        app.undoButton.click();
        assertEquals("", app.getEditor().getText());
    }

    @Test
    public void testCutPasteUndo() {
        Application app = new Application();

        app.setInput("123456");
        app.inputButton.click();

        app.cutButton.click();
        assertEquals("", app.getEditor().getText());
        assertEquals("123456", app.getClipboard());

        app.pasteButton.click();
        assertEquals("123456", app.getEditor().getText());

        app.undoButton.click();
        assertEquals("", app.getEditor().getText());

        app.undoButton.click();
        assertEquals("123456", app.getEditor().getText());

        app.undoButton.click();
        assertEquals("", app.getEditor().getText());
    }

    @Test
    public void testEmptyCutPaste() {
        Application app = new Application();

        app.cutButton.click();
        assertEquals("", app.getEditor().getText());
        assertEquals("", app.getClipboard());

        app.pasteButton.click();
        assertEquals("", app.getEditor().getText());
    }

}
