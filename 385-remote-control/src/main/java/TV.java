// All devices follow the same interface.

public abstract class TV implements Device {

    private boolean isEnabled;
    private int volume;

    //todo: add code here to add a private int field named channel, and set its default value to 1
    private int channel = 1;

    private String brand;

    private boolean isPlaying;

    // implement the Device interface.

    public String getBrand(){
        //todo: add code here to return the brand
        return brand;
    }
    public void setBrand(String brand){
        //todo: add code here to set the brand
        this.brand = brand;
    }
    public boolean isEnabled(){
        //todo: add code here to return the isEnabled
        return isEnabled;
    }

    public void enable(){
        //todo: add code here to set the isEnabled
        isEnabled = true;
    }

    public void disable(){
        //todo: add code here to set the isEnabled
        isEnabled = false;
    }

    public int getVolume(){

        System.out.println("Getting TV volume: " + volume + "%");

        //todo: add code here to return the volume

        return volume;


    }

    public void setVolume(int percent){
        //todo: add code here to set the volume
        //percent is between 0 and 100

        if(percent > 100)
            percent = 100;
        else if(percent < 0)
            percent = 0;
        volume = percent;

        System.out.println("Setting TV volume to " + percent);
    }

    public int getChannel(){
        System.out.println("Getting TV channel");
        return channel;
    }

    public void setChannel(int channel){
        System.out.println("Setting TV channel to " + channel);
        this.channel = channel;
    }

    public void next(){
        //todo: add code here to increase the channel by 1
        int channel = getChannel();
        setChannel(channel + 1);

        System.out.println("Next TV channel");
    }

    public boolean isPlaying(){
        System.out.println("TV is "+ (isPlaying ? " " : " not ") + "playing.");
        return isPlaying;
    }

    public void play(){
        isPlaying = true;
        System.out.println("Play TV");
    }

    public void pause(){
        isPlaying = false;
        System.out.println("Pause TV");
    }

    public void previous(){
        //todo: add code here to decrease the channel by 1
        int channel = getChannel();
        setChannel(channel - 1);

        System.out.println("Previous TV channel");
    }


}