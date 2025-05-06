import org.junit.Test;

import java.util.Arrays;


import static org.junit.Assert.assertEquals;
public class AudioPlayerTest {
    @Test
    public void test1(){
        Tape tape = new Tape(Arrays.asList("Billie Jean", "Beat It", "Thriller"), "Michael Jackson");


        AudioPlayer player = new AudioPlayer(tape);

        assertEquals("Ready",player.getStateName());

    }

    @Test
    public void test2(){
        Tape tape = new Tape(Arrays.asList("Billie Jean", "Beat It", "Thriller"), "Michael Jackson");
        AudioPlayer player = new AudioPlayer(tape);

        player.getUI().getPlayButton().click();

        assertEquals("Playing",player.getStateName());

    }

    @Test
    public void test3(){
        Tape tape = new Tape(Arrays.asList("Billie Jean", "Beat It", "Thriller"), "Michael Jackson");
        AudioPlayer player = new AudioPlayer(tape);

        player.getUI().getLockButton().click();

        assertEquals("Locked",player.getStateName());

    }

    @Test
    public void test4(){
        Tape tape = new Tape(Arrays.asList("Billie Jean", "Beat It", "Thriller"), "Michael Jackson");
        AudioPlayer player = new AudioPlayer(tape);

        player.getUI().getPlayButton().click();
        player.getUI().getLockButton().click();

        assertEquals("Locked",player.getStateName());

    }


}
