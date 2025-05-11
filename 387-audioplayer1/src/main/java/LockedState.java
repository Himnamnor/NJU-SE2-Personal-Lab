// Concrete states implement various behaviors associated with a
// state of the context.
class LockedState extends State {
    public LockedState(AudioPlayer player) {
        super(player);
        name = "Locked";
    }

    // When you unlock a locked player, it may assume one of two
    // states.
    public void clickLock() {
        //todo:add code here
        //change state to LockedState if player is not locked
        //change state to ReadyState if player is locked
        String state = player.getStateName();
        if (state.equals("Locked")) {
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
        // Locked, so do nothing.
    }

    public void clickNext() {
        // Locked, so do nothing.
    }

    public void clickPrevious() {
        // Locked, so do nothing.
    }

    public void clickUp() {
        // Locked, so do nothing.
    }

    ;

    public void clickDown() {
        // Locked, so do nothing.
    }
}