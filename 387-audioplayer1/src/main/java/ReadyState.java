class ReadyState extends State {
    public ReadyState(AudioPlayer player) {
        //todo:add code here
        // call super constructor
        // initialize name
        super(player);
    }

    public void clickLock() {
        //todo:add code here
        //change state to LockedState

    }

    public void clickPlay() {
        //todo:add code here
        //start playing
        //change state to PlayingState

    }

    public void clickNext() {
        player.nextSong();
    }

    public void clickPrevious() {
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
