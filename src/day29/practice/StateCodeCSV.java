package day29.practice;

import com.opencsv.bean.CsvBindByName;

public class StateCodeCSV {

    @CsvBindByName(column = "SrNo")
    public int srNo;

    @CsvBindByName(column = "StateName")
    public String stateName;

    @CsvBindByName(column = "TIN")
    public int tin;

    @CsvBindByName(column = "StateCode")
    public String stateCode;
}
