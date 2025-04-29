# Remote Control (25分)

## 题目
我们家里有一些影音设备，比如电视机、音响、投影仪等等。我们给这些设备定义了一个Device接口。
这些设备都有自己的遥控器，但是每次使用的时候都要找遥控器，很是麻烦。现在我们想要一个遥控器，可以控制所有的设备。
控制器也可以分为普通遥控器和高级遥控器。普通遥控器只能控制设备的开关和音量，重新匹配设备，而高级遥控器还可以控制设备的静音和特殊功能。
控制器和设备之间利用了Bridge Pattern，使得控制器和设备可以独立变化。
设备可以有不同品牌的设备，比如AppleTV、HuaweiTV、AppleSoundBox、HuaweiSoundBox等等。
只要重新匹配设备，就可以用同一个遥控器控制不同品牌的设备。

初次之外，对于设备的创建问题，我们使用了Abstract Factory Pattern，使得我们可以方便的创建不同品牌的设备。
我们可以创建AppleHomeDeviceFactory和HuaweiHomeDeviceFactory，分别用于创建Apple品牌和Huawei品牌的设备。
也可以创建其他品牌的设备工厂，或者混合品牌的设备工厂，比如HybridHomeDeviceFactory等等，只要这个工厂实现了HomeDeviceFactory接口即可。


##任务
请在//todo:add code here处补充缺失的代码，通过所有测试用例。

## 公开测试用例（公开测试用例也是计分的! 另外有 15 个非公开测试用例）

    //test1: 用RemoteControl控制AppleTV
    @Test
    public void test1(){
        TV tv = new AppleTV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
        remote.volumeUp();

        assertEquals(true,tv.isEnabled());
        assertEquals(10,tv.getVolume());

    }

    //test2: 用AdvancedRemoteControl控制HuaweiSoundBox
    @Test
    public void test2(){
        SoundBox soundBox = new HuaweiSoundBox();
        AdvancedRemoteControl remote2 = new AdvancedRemoteControl(soundBox);
        remote2.togglePower();
        remote2.mute();

        assertEquals(true,soundBox.isEnabled());
        assertEquals(0,soundBox.getVolume());
    }

    //test3: 用RemoteControl控制AppleSoundBox
    @Test
    public void test3(){
        AppleHomeDeviceFactory factory = new AppleHomeDeviceFactory();
        Device soundBox = factory.createSoundBox();
        RemoteControl remote = new RemoteControl(soundBox);
        remote.togglePower();
        remote.volumeUp();

        assertEquals(true,soundBox.isEnabled());
        assertEquals(10,soundBox.getVolume());

    }

    //test4: 用AdvancedRemoteControl控制HuaweiTV
    @Test
    public void test4(){
        HuaweiHomeDeviceFactory factory = new HuaweiHomeDeviceFactory();
        Device tv = factory.createTV();
        AdvancedRemoteControl remote = new AdvancedRemoteControl(tv);
        remote.togglePower();
        remote.mute();

        assertEquals(true,tv.isEnabled());
        assertEquals(0,tv.getVolume());
    }

    //test5: 用AdvancedRemoteControl控制HuaweiTV，然后用reMatch()重新匹配AppleTV
    @Test
    public void test5(){
        HuaweiHomeDeviceFactory factory = new HuaweiHomeDeviceFactory();
        Device tv = factory.createTV();
        AdvancedRemoteControl remote = new AdvancedRemoteControl(factory.createTV());
        remote.mute();
        assertEquals("Huawei",tv.getBrand());

        AppleHomeDeviceFactory factory2 = new AppleHomeDeviceFactory();
        tv = factory2.createTV();
        remote.reMatch(tv);
        remote.volumeUp();
        assertEquals("Apple",tv.getBrand());



    }