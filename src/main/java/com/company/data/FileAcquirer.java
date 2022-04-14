package com.company.data;

public interface FileAcquirer {


    String[][] getArrayFromFile(String filePath);

    void writeArrayToFile(String filePath, String[] abc);

}
