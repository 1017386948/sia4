package soundsystem;

import org.springframework.stereotype.Component;

@Component

public class ClassicMusics implements CompactDisc {
    @Override
    public void play() {
        System.out.println("It's classic.");
    }
}
