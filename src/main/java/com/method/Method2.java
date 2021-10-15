package com.method;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * 斐波那契数列，求第n个数的值
 *
 * @author songchao
 * @date 2021/10/14 10:34
 */
public class Method2 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        System.out.print(feibonaqie(44)+"--------------");
        long end = System.currentTimeMillis();
        System.out.println("循环==="+(end-begin));



        begin = System.currentTimeMillis();
        System.out.print(feibonaqie2(44)+"---------------");
        end = System.currentTimeMillis();
        System.out.println("递归==="+(end-begin));

    }

    /**
     * 从前往后计算出值
     * @param n
     * @return
     */
    private static int feibonaqie(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int[] f = new int[n];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n-1; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n-1];
    }

    /**
     * 递归    简单  但是耗费性能
     * @param n
     * @return
     */
    private static int feibonaqie2(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return feibonaqie2(n-1)+feibonaqie2(n-2);
    }

}
