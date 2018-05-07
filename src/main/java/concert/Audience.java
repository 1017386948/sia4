package concert;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Audience {

    @After("execution(* concert.Performance.perform(..))")
    public void silenceCellphones() {
        System.out.println("Silencing cell phones");
    }

}
