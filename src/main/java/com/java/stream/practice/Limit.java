package com.java.stream.practice;

import com.java.stream.practice.utils.PrintUtil;

import java.util.Arrays;
import java.util.List;

public class Limit {

    public static void main(String[] args) {
        long limit = 1;

        // Legacy
        List<String> strs = Arrays.asList("practice", "java", "stream");
        long count = 0;
        for(String str : strs){
            if(str.contains("a")){
                PrintUtil.println(str);
                count++;
            }
            if(limit <= count) {
                break;
            }
        }
        PrintUtil.println();

        // Stream
        strs.stream()
            .filter(x -> x.contains("a"))
            .limit(limit)
            .forEach(x ->  PrintUtil.println(x));
    }
}
