import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoteControlTest {

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






}
