class ReadyState extends State {
    public ReadyState(AudioPlayer player) {
        //todo:add code here
        // call super constructor
        // initialize name
        super(player);
        this.name = "Ready";
    }

    public void clickLock() {
        //todo:add code here
        //change state to LockedState
        System.out.println("Player is locking");
        player.changeState(new LockedState(player));
        System.out.println("Player is now locked");
    }

    public void clickPlay() {
        //todo:add code here
        //start playing
        //change state to PlayingState
        player.changeState(new PlayingState(player));
        System.out.println("Player is now playing: " + player.getCurrentSong());
    }

    public void clickNext() {
        player.nextSong();
    }

    public void clickPrevious() {
        player.previousSong();
    }

    public void clickUp() {
        //todo:add code here
        //increase volume
        player.increaseVolume();
    }

    ;

    public void clickDown() {
        //todo:add code here
        //decrease volume
        player.decreaseVolume();
    }

}
