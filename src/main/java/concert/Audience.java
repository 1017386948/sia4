package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    @Pointcut("execution(* concert.Performance.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellphones() {
        System.out.println("Silencing cell phones");
    }

    @After("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            System.out.println("hehe");
        }
    }
}
