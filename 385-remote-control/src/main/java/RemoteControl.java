// The "abstraction" defines the interface for the "control"
// part of the two class hierarchies. It maintains a reference
// to an object of the "implementation" hierarchy and delegates
// all of the real work to this object.
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        //todo: add code here to initialize the device
        this.device = device;
    }

    public void togglePower() {
        //todo: add code here to toggle the power
        //if the device is enabled, disable it
        //if the device is disabled, enable it
        System.out.println("Toggling the power");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        System.out.println("Volume down");

        //todo: add code here to decrease the volume by 10
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        System.out.println("Volume up");

        //todo: add code here to increase the volume by 10
        device.setVolume(device.getVolume() + 10);
    }

    public void left() {
        System.out.println("Previous");

        //todo: add code here to play the previous channel
        //first previous, then play
        device.previous();
        device.play();
    }

    public void center() {

        System.out.println("Play");

        //todo: add code here to play
        //if the device is playing, pause it
        //if the device is paused, play it
        if(device.isPlaying())
            device.pause();
        else
            device.play(); ;
    }

    public void right(){

        System.out.println("Next");

        //todo: add code here to play the next channel
        //first next, then play
        device.next();
        device.play();
    }

    public void reMatch(Device d){
        System.out.println("Rematch to new device");

        //todo: add code here to rematch to a new device
        this.device = d;
    }
}