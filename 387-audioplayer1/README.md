# Audio Player

## 题目
+ 我们有一个音乐播放器。播放器上有播放、向前、向后、+、-、上锁按钮六个按钮。按钮的图标分别是"P"、"<<"、">>"、"+"、"-"、"L"。
+ 音乐播放器有3个状态：上锁、播放、准备播放。状态的名字为："Locked"、"Playing"、"Ready"。
+ 上锁状态下，播放、向前、向后、+、-按钮都不可用；上锁按钮按下后，播放器进入准备播放状态。
+ 播放状态下，播放按钮会暂停播放，播放器进入准备播放状态；向前按钮会播放上一首；向后按钮会播放下一首；+按钮会增加音量；-按钮按会减少音量。
+ 音量最小为0，最大为100；每次按下+或-按钮，音量增加或减少10。初始化音量为30。
+ 准备播放状态下，播放按钮会播放音乐，播放器进入播放状态；其它按钮同播放状态时候。
+ 音乐播放器的初始状态是准备播放状态。


## 代码解释
AudioPlayer类是播放器类
Button类是按键类
State是状态的抽象类
PlayingState是播放状态类
ReadyState是准备播放状态类
LockedState是上锁状态类
UIInterface是UI界面类
OnClickedListener是按键点击监听器接口

## 测试用例
```
    public void test1(){
        AudioPlayer player = new AudioPlayer();

        player.clickPlay();
        player.clickNext();
        player.clickPrevious();
        assertEquals("Playing",player.getState());

    }
```



##任务
请在//todo:add code here处补充缺失的代码，通过所有测试用例。

