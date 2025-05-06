import java.util.List;

public class Tape {
    private List<String> playlist;

    private String player;

    public Tape(List<String> playlist, String player) {
        this.playlist = playlist;
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public List<String> getPlaylist() {
        return playlist;
    }

}
