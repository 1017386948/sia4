package concert;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:concert.xml"})
public class Test {

    @Autowired
    private Performance pianist;

    @org.junit.Test
    public void begin(){
        pianist.perform();
    }
}

