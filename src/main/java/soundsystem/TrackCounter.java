package soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* soundsystem.CompactDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber) {
    }

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        Integer currentCount = trackCounts.get(trackNumber);
        trackCounts.put(trackNumber, currentCount == null ? 1 : currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        Integer count = trackCounts.get(trackNumber);
        return count == null ? 0 : count;
    }

}
