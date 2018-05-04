package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
    @Before("execution(**concert.Performance.perform(..))")
    public void silenceCellphones() {
        System.out.println("Silencing cell phones");
    }

}
