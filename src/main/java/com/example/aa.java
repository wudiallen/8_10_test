package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author songchao
 * @date 2021/8/17 17:03
 */
public class aa {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(null);
        nums.add(2);
        nums.add(3);
        nums.add(null);
        nums.add(2);
        nums.add(4);
        nums.add(5);
        // null 2  3  null 2  4  5
        //nums.stream().filter(num -> num != null).distinct().mapToInt(i -> i*2).peek(System.out::println).skip(2).limit(3).sum();
        List<Integer> collect = nums.stream().filter(num -> num != null).collect(Collectors.toList());

    }
}

