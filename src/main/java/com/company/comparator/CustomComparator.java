package com.company.comparator;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] words = o1.split(" ");
        String[] words2 = o2.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].compareTo(words2[i]) != 0) {
                if (NumberUtils.isNumber(words[i]) && NumberUtils.isNumber(words2[i])) {
                    double firstNumber = Double.parseDouble(words[i]);
                    double secondNumber = Double.parseDouble(words2[i]);
                    return Double.compare(firstNumber, secondNumber);
                } else {
                    return words[i].compareTo(words2[i]);
                }
            }

        }
        return 0;
    }
}