package day29.practice;

import com.opencsv.bean.CsvBindByName;

public class StateCensusCSV {

    @CsvBindByName(column = "State")
    public String state;

    @CsvBindByName(column = "Population")
    public int population;

    @CsvBindByName(column = "AreaInSqKm")
    public int area;

    @CsvBindByName(column = "DensityPerSqKm")
    public int density;
}
