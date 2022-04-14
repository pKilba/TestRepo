package com.company.start;

import com.company.comparator.CustomComparator;
import com.company.data.FileAcquirer;
import com.company.data.impl.FileDataAcquirer;
import com.company.util.DataTranslation;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String filePath = "D:/chart2.txt";
        FileAcquirer chartReader = new FileDataAcquirer();
        String[][] myArray = chartReader.getArrayFromFile(filePath);
        String[] abc = DataTranslation.convertingMatrixToStringArray(myArray);
        Arrays.sort(abc, new CustomComparator());
        filePath = "D:/open.txt";
        chartReader.writeArrayToFile(filePath, abc);
    }


}