package com.java.stream.practice;

import com.java.stream.practice.utils.PrintUtil;

import java.util.Arrays;
import java.util.List;

public class Skip {

    public static void main(String[] args) {
        long skip = 2;

        // Legacy
        List<String> strs = Arrays.asList("practice", "java", "stream");
        for(int i = 0; i < strs.size() ;i++){
            String str = strs.get(i);
            if(i < skip){
                continue;
            }
            if(str.contains("a")){
                PrintUtil.println(str);
            }
        }
        PrintUtil.println();

        // Stream
        strs.stream()
            .skip(skip)
            .filter(x -> x.contains("a"))
            .forEach(x ->  PrintUtil.println(x));
    }
}
