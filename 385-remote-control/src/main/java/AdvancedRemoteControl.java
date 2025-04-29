// You can extend classes from the abstraction hierarchy
// independently from device classes.
public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {

        //todo: add code here to mute the device
        device.setVolume(0);
    }

    public void uniqueFunction(){
        System.out.println("This is a unique function.");


        //todo: add code here to implement unique function
        //hint: you need to check the type of device
        //      and call the corresponding function
        //      e.g. if device is AppleTV, call airPlay()
        //           if device is HuaweiTV, call screenShare()
        //      currently, we cannot support other devices's unique function
        //      so just print "This device does not support unique function."
        if(device instanceof TV){
            if(device instanceof AppleTV)
                ((AppleTV) device).airPlay();
            else if(device instanceof HuaweiTV){
                ((HuaweiTV) device).screenShare();
            }
            else{
                System.out.println("This device does not support unique function.");
            }
        }
        else{
            System.out.println("This device does not support unique function.");
        }
    }
    public static void main(String[] args) {
        // Somewhere in client code.
        TV tv = new AppleTV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
        remote.volumeUp();

        SoundBox soundBox = new HuaweiSoundBox();
        AdvancedRemoteControl remote2 = new AdvancedRemoteControl(soundBox);
        remote2.togglePower();
        remote2.mute();
    }
}