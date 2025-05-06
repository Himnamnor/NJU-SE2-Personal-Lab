// The base state class declares methods that all concrete
// states should implement and also provides a backreference to
// the context object associated with the state. States can use
// the backreference to transition the context to another state.
abstract class State {
    String name;
    protected AudioPlayer player;

    // Context passes itself through the state constructor. This
    // may help a state fetch some useful context data if it's
    // needed.
    public State(AudioPlayer player) {
        this.player = player;
    }

    public String getName(){
        return name;
    }
    public abstract void clickLock();

    public abstract void clickPlay();

    public abstract void clickNext();

    public abstract void clickPrevious();

    public abstract void clickUp();

    public abstract void clickDown();


}