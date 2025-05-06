# Command History

## 题目
+ 有一个文本编辑器应用，里面一个文本框和4个按钮，分别是Copy，Paste，Cut，Undo。
+ Copy，Paste，Cut，Undo都是命令，都有execute方法，代表方法的执行。
+ Copy是复制文本框全部内容到剪贴板。
+ Paste是把剪贴板内容粘贴加到文本框内容后面。
+ Cut是把文本框内容全部剪切到剪贴板。
+ Undo是撤销上一次的操作。
+ 除此之外，用户还可以执行输入操作，输入的内容会加到文本框内容后面。
+ 除此之外，用户还可以执行删除操作，删除文本框内所有内容。
+ Copy和Undo不被计入CommandHistory


## 代码解释

+ 代码中有一个Application类，是这个文本编辑器应用。它包含一个文本框和，4个按钮，分别是Copy，Paste，Cut，Undo。
+ 代码中有一个CommandHistory类，用来记录所有的命令，以便Undo操作。
+ 代码中有一个Command类，用来定义所有的命令的父类，execute方法，代表方法的执行。
+ 代码中有一个CopyCommand类，用来定义Copy命令。
+ 代码中有一个PasteCommand类，用来定义Paste命令。
+ 代码中有一个CutCommand类，用来定义Cut命令。
+ 代码中有一个UndoCommand类，用来定义Undo命令。
+ 代码中有一个Button类，用来定义按钮。
+ 代码中有一个Editor类，用来定义文本框。
+ 代码中有一个OnClickListener类，用来定义按钮的点击事件。

## 测试用例
```
    public void test1(){
        //test input
        Application app = new Application();
        app.setInput("123");
        app.inputButton.click();


        assertEquals("123",app.getEditor().getText());

    }
```



##任务
请在//todo:add code here处补充缺失的代码，通过所有测试用例。

