public class HuaweiHomeDeviceFactory implements HomeDeviceFactory{
    public Device createTV(){
        //todo: add code here to return a new HuaweiTV
        return new HuaweiTV();
    }
    public Device createSoundBox(){
        //todo: add code here to return a new HuaweiSoundBox
        return new HuaweiSoundBox();
    }
}
