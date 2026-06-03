package day29.practice;

import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {

    private static final String CENSUS_FILE =
            "src/main/resources/IndiaStateCensusData.csv";

    @Test
    public void givenStateCensusCSV_ShouldReturnRecordCount()
            throws CensusAnalyserException {

        StateCensusAnalyser analyser =
                new StateCensusAnalyser();

        int count =
                analyser.loadIndiaCensusData(CENSUS_FILE);

        Assert.assertEquals(29, count);
    }
}
