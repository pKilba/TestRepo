package com.company.data.impl;

import com.company.data.FileAcquirer;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDataAcquirer implements FileAcquirer {

    public String[][] getArrayFromFile(String filePath) {
        Scanner scannMatrix = null;
        ArrayList<ArrayList> Matrix = new ArrayList<ArrayList>();
        //Чтение файла и запись в сканер
        try {
            scannMatrix = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }
        //Запись данных из сканера в двумерный ArrayList
        while (scannMatrix.hasNextLine()) {
            Scanner scanLine = new Scanner(scannMatrix.nextLine());
            ArrayList<String> line = new ArrayList<>();
            while (scanLine.hasNext()) {
                line.add((scanLine.next()));
            }
            Matrix.add(line);
        }
        //Определение размера и инициализация массива
        int arrWidth = Matrix.size();
        int arrLength = Matrix.get(0).size();
        String[][] array = new String[arrWidth][arrLength];
        for (int y = 0; y < Matrix.size(); y++) {
            for (int x = 0; x < Matrix.get(y).size(); x++) {
                array[y][x] = (String) Matrix.get(y).get(x);
            }
        }
        return array;

    }

    public void writeArrayToFile(String filePath, String[] abc) {
        String newString;
        try (FileWriter writer = new FileWriter(filePath)) {
            for (int i = 0; i < abc.length; ++i) {
                newString = abc[i].replace("null", " ");
                writer.write(newString + " \n ");
                writer.write("\r\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
