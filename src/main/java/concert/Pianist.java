package concert;

import org.springframework.stereotype.Component;

@Component
public class Pianist implements Performance {
    @Override
    public void perform() {
        System.out.println("Playing piano.");
        throw new RuntimeException();
    }
}
