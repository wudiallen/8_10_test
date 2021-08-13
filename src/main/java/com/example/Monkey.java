package com.example;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 选大王
 * @author songchao
 * @date 2021/8/13 15:45
 */
public class Monkey {
    /**
     * @param num  猴子数量
     * @param quit 数到quit时退出
     * @return
     */
    public static int King(int num, int quit) {
        //初始化猴子
        int[] arr = new int[num];
        int q = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }
        //查数
        while (true) {
            //一遍一遍的查数
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != -1) {
                    q++;
                    //循环遍历数组
                    if (q % quit == 0) {
                        arr[i] = -1;
                    }
                }
            }
            //退出条件
            int a = 0;
            for (int i = 0; i < arr.length; i++) {
                //查询有几个没退出的
                if (arr[i] != -1) {
                    a++;
                }
            }
            if (a == 1) {
                break;
            }
        }
        //返回第几个猴子
        Integer[] integers = Arrays.stream(arr).filter(i -> i != -1).boxed().toArray(Integer[]::new);
        return integers[0];
    }

}
