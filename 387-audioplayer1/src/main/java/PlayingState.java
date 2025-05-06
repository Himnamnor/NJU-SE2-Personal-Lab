class PlayingState extends State {
    public PlayingState(AudioPlayer player) {
        super(player);
        name = "Playing";
    }

    public void clickLock() {
        //todo:add code here
        //change state to LockedState

    }

    public void clickPlay() {
        //todo:add code here
        //stop playing
        //change state to ReadyState

    }

    public void clickNext() {
        // Implement event handling for double-click
        player.nextSong();
    }

    public void clickPrevious() {
        // Implement event handling for double-click
        player.previousSong();
    }

    public  void clickUp(){
        //todo:add code here
        //increase volume

    };

    public  void clickDown(){
        //todo:add code here
        //decrease volume

    }

}