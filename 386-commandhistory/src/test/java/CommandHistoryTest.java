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




}
