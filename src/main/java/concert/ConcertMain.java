package concert;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConcertMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("concert.xml");
        Performance per = context.getBean(Performance.class);
        per.perform();
    }
}
