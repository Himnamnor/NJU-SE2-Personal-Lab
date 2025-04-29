public abstract class  SoundBox implements Device {
    private boolean isEnabled;
    private int volume;

    private String brand;

    private boolean isPlaying;

    public String getBrand(){
        //todo: add code here to return the brand
        return brand;
    }

    public void setBrand(String brand){
        //todo: add code here to set the brand
        this.brand = brand;
    }

    // implement the Device interface.

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
        System.out.println("Getting Music volume: " + volume + "%");

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

        System.out.println("Setting Music volume to " + percent);
    }

    public void next(){

        System.out.println("Next Music");
    }

    public boolean isPlaying(){
        System.out.println("Music is" + (isPlaying ? " " : " not ") + "playing.");
        return isPlaying;
    }
    public void play(){
        isPlaying = true;
        System.out.println("Play Music");
    }

    public void pause(){
        isPlaying = false;
        System.out.println("Pause Music");
    }

    public void previous(){
        System.out.println("Previous Music");
    }

}