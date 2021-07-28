package ru.julia;

import com.opencsv.CSVReader;
import com.opencsv.bean.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 InstantiationException - исключение когда я хочу создать объект
 NoSuchMethodException - нет метода
 <init> - это название метода, этим словом обозначается название конструктора

 */
public class Main {
//    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("salary.csv");
        List<Salary> result = new CsvToBeanBuilder(fileReader).
        withType(Salary.class).
                withSeparator(';').
                build().parse();
        for (Salary salary : result) {
            System.out.println(salary);
        }
    }

}
