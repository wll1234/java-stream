package com.java.stream.practice;

import com.java.stream.practice.utils.PrintUtil;

import java.util.Arrays;
import java.util.List;

public class Map {

    public static void main(String[] args) {
        // Legacy
        List<String> strs = Arrays.asList("practice", "java", "stream");
        for(String str : strs){
            str = str.concat("sssss");
            PrintUtil.println(str);
        }
        PrintUtil.println();

        // Stream
        strs.stream()
                .map(x -> x.concat("sssss"))
                .forEach(x ->  PrintUtil.println(x));
    }
}
