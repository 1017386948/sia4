package concert;

import org.springframework.stereotype.Service;

@Service
public class Pianist implements Performance {
    @Override
    public void perform() {
        System.out.println("Playing piano.");
    }
}
