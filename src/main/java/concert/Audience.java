package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {


    @Before("execution(* concert.Performance.perform()) && bean(pianist)")
    public void silenceCellphones() {
        System.out.println("Silencing cell phones");
    }

}
