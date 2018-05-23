package soundsystem.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;
import soundsystem.SpEL;
import soundsystem.Unique;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:compactDisc.xml"})
public class SoundSystemTest {
    @Unique
    @Autowired
    CompactDisc cd;
    @Value("#{systemProperties['name']}")
    String name;
    @Autowired
    SpEL spEL;

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("compactDisc.xml");
        cd.play();
        cd.playTrack(1);
        assertEquals(1, 1);
    }
}
