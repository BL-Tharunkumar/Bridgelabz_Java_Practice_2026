package day29.practice;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;

public class StateCensusAnalyser {

    public int loadIndiaCensusData(String csvFilePath)
            throws CensusAnalyserException {

        try {

            Reader reader =
                    new FileReader(csvFilePath);

            CsvToBean<StateCensusCSV> csvToBean =
                    new CsvToBeanBuilder<StateCensusCSV>(reader)
                            .withType(StateCensusCSV.class)
                            .withIgnoreLeadingWhiteSpace(true)
                            .build();

            Iterator<StateCensusCSV> iterator =
                    csvToBean.iterator();

            int count = 0;

            while (iterator.hasNext()) {
                iterator.next();
                count++;
            }

            return count;

        } catch (java.io.FileNotFoundException e) {

            throw new CensusAnalyserException(
                    "File Not Found",
                    CensusAnalyserException.ExceptionType.NO_SUCH_FILE);

        } catch (RuntimeException e) {

            throw new CensusAnalyserException(
                    "CSV Problem",
                    CensusAnalyserException.ExceptionType.INCORRECT_HEADER);
        }
    }

    public int loadIndiaStateCode(String csvFilePath)
            throws CensusAnalyserException {

        try {

            Reader reader =
                    new FileReader(csvFilePath);

            CsvToBean<StateCodeCSV> csvToBean =
                    new CsvToBeanBuilder<StateCodeCSV>(reader)
                            .withType(StateCodeCSV.class)
                            .build();

            return (int) csvToBean.stream().count();

        } catch (Exception e) {

            throw new CensusAnalyserException(
                    e.getMessage(),
                    CensusAnalyserException.ExceptionType.NO_SUCH_FILE);
        }
    }
}
