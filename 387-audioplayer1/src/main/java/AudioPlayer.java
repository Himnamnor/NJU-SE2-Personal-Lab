import java.util.*;

// The AudioPlayer class acts as a context. It also maintains a
// reference to an instance of one of the state classes that
// represents the current state of the audio player.
class AudioPlayer {
    private State state;
    private UserInterface UI;
    private int volume=30;
    private List<String> playlist;
    private int currentSongIndex;

    private Tape tape;

    public AudioPlayer(Tape tape) {
        //todo:add code here
        // The audio player's default state is ReadyState.



        //todo:add code here
        // create a UserInterface object
        // initialize tape, playlist and currentSongIndex


    }

    // Other objects must be able to switch the audio player's
    // active state.
    public void changeState(State state) {
        //todo:add code here

    }

    public State getState(){
        //todo:add code here
        //return current state
        return null;
    }

    public String getStateName(){
        //todo:add code here
        //return current state name
        return null;
    }


    // A state may call some service methods on the context.
    public void startPlay() {
        // ...
        System.out.println("Start playing: " + playlist.get(currentSongIndex));
    }

    public void stopPlay() {
        // ...
        System.out.println("Stop playing: " + playlist.get(currentSongIndex));
    }

    public void nextSong() {
        //todo:add code here
        // current song change to next song
        // if current song is the last song, change to the first song

    }

    public void previousSong() {
        //todo:add code here
        // current song change to previous song
        // if current song is the first song, change to the last song

    }
    public String getCurrentSong(){
        System.out.println("Current song: " + playlist.get(currentSongIndex));
        return playlist.get(currentSongIndex);
    }

    public void increaseVolume() {
        //todo:add code here
        // increase volume by 10

    }

    public void decreaseVolume() {
        //todo:add code here
        // decrease volume by 10

    }
    public int getVolume(){
        System.out.println("Volume: " + volume);
        return volume;
    }

    public boolean isLocked() {
        //todo:add code here
        //return current state is LockedState or not
        return false;
    }

    public UserInterface getUI(){
        return UI;
    }
}