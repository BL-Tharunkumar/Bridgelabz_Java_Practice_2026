package day20.practice;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMessage_ShouldReturnSAD() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser();

        String mood =
                moodAnalyser.analyseMood("I am in Sad Mood");

        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenHappyMessage_ShouldReturnHAPPY() {

        MoodAnalyser moodAnalyser =
                new MoodAnalyser();

        String mood =
                moodAnalyser.analyseMood("I am in Happy Mood");

        Assert.assertEquals("HAPPY", mood);
    }
}
