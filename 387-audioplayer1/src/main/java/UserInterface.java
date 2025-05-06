class UserInterface {
    private Button lockButton = new Button("L");
    private Button playButton = new Button("P");
    private Button nextButton = new Button(">");
    private Button prevButton = new Button("<");
    private Button volumeUpButton = new Button("+");
    private Button volumeDownButton = new Button("-");

    public UserInterface(AudioPlayer player) {

        lockButton.setOnClick(() -> {
            System.out.println("Lock button clicked");
            State state = player.getState();
            state.clickLock();
        });
        playButton.setOnClick(() -> {
            System.out.println("Play button clicked");
            State state = player.getState();
            state.clickPlay();
        });
        nextButton.setOnClick(() -> {
            System.out.println("Next button clicked");
            State state = player.getState();
            state.clickNext();
        });
        prevButton.setOnClick(() -> {
            System.out.println("Previous button clicked");
            State state = player.getState();
            state.clickPrevious();
        });
        volumeUpButton.setOnClick(() -> {
            System.out.println("Volume Up button clicked");
            State state = player.getState();
            state.clickUp();
        });
        volumeDownButton.setOnClick(() -> {
            System.out.println("Volume Down button clicked");
            State state = player.getState();
            state.clickDown();
        });
    }

    public Button getLockButton() {
        return lockButton;
    }

    public Button getPlayButton() {
        return playButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public Button getPrevButton() {
        return prevButton;
    }

    public Button getVolumeUpButton() {
        return volumeUpButton;
    }

    public Button getVolumeDownButton() {
        return volumeDownButton;
    }
}