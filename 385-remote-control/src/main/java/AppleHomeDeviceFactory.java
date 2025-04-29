public class AppleHomeDeviceFactory implements HomeDeviceFactory{
    public Device createTV(){
        //todo: add code here to return a new AppleTV
        return new AppleTV();
    }
    public Device createSoundBox(){
        //todo: add code here to return a new AppleSoundBox
        return new AppleSoundBox();
    }

}
