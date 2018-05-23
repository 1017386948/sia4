package soundsystem;

import org.springframework.stereotype.Component;

@Component

public class ClassicMusics implements CompactDisc {
    @Override
    public void play() {
        System.out.println("It's classic.");
    }

    @Override
    public void playTrack(int track) {
        System.out.println("Playing classic music. Track " + track);
    }

}
