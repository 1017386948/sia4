package com.springinaction.knights.test;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Test
    public void KnightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class, "embark");
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
//        verify(mockQuest, time(1).embark());

    }

}
