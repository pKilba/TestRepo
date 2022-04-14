package com.company.util;

public class DataTranslation {

    public static String[] convertingMatrixToStringArray(String[][] myArray) {
        String[] abc = new String[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            abc[i] = "";
            for (int j = 0; j < myArray[i].length; j++) {
                abc[i] += myArray[i][j];
                abc[i] += " ";

            }
        }
        return abc;
    }
}
