package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"I", "want", "sleeeep", "heh"};
        Integer[] integers = {1, 2, 3, 4};

        SaveMassType<String> stringSaveMassType = new SaveMassType<>(strings);
        SaveMassType<Integer> integerSaveMassType = new SaveMassType<>(integers);

        System.out.println(Arrays.toString(stringSaveMassType.getArray()));
        System.out.println(Arrays.toString(integerSaveMassType.getArray()));
    }
}