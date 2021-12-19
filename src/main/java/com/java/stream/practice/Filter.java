package com.java.stream.practice;

import com.java.stream.practice.utils.PrintUtil;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        // Legacy
        List<String> strs = Arrays.asList("practice", "java", "stream");
        long count = 0;
        for(String str : strs){
            if(str.contains("a")){
                count++;
            }
        }
        PrintUtil.println("count = "+count);

        // Stream
        count = strs.stream().filter(x -> x.contains("a")).count();
        PrintUtil.println("count = "+count);
    }

}
