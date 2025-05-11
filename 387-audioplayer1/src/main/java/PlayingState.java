class PlayingState extends State {
    public PlayingState(AudioPlayer player) {
        super(player);
        name = "Playing";
    }

    public void clickLock() {
        //todo:add code here
        //change state to LockedState
        if (player.getStateName().equals("Locked")) {
            player.changeState(new ReadyState(player));
            System.out.println("Unlocking the player...");
            System.out.println("Player is now in Ready state.");
        } else {
            player.changeState(new LockedState(player));
            System.out.println("Locking the player...");
            System.out.println("Player is now in Locked state.");
        }
    }

    public void clickPlay() {
        //todo:add code here
        //stop playing
        //change state to ReadyState
        System.out.println("Stop playing: " + player.getCurrentSong());
        player.changeState(new ReadyState(player));
        System.out.println("Player is now in Ready state.");
    }

    public void clickNext() {
        // Implement event handling for double-click
        player.nextSong();
    }

    public void clickPrevious() {
        // Implement event handling for double-click
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