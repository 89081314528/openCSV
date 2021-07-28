package ru.julia;

import com.opencsv.bean.CsvBindByName;

public class Salary {
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "fullSalaryGross")
    private int fullSalaryGross;
    @CsvBindByName(column = "contractualSalaryGross")
    private int contractualSalaryGross;
    @CsvBindByName(column = "kpi")
    private int kpi;

    public Salary(String name, int fullSalaryGross, int contractualSalaryGross, int kpi) {
        this.name = name;
        this.fullSalaryGross = fullSalaryGross;
        this.contractualSalaryGross = contractualSalaryGross;
        this.kpi = kpi;
    }

    public Salary() {
    }

    public String getName() {
        return name;
    }

    public int getFullSalaryGross() {
        return fullSalaryGross;
    }

    public int getContractualSalaryGross() {
        return contractualSalaryGross;
    }

    public int getKpi() {
        return kpi;
    }

    public String toString() {
        return name + " " + fullSalaryGross + " " + contractualSalaryGross + " " + kpi;
    }
}
