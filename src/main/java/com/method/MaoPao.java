package com.method;

import java.net.Socket;

/**
 * 冒泡排序
 *
 * @author songchao
 * @date 2021/10/9 16:13
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = new int[]{24, 12, 14, 66, 14, 15, 16, 66};
        maoPao(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    //从小到大
    static void maoPao(int[] arr) {
        int i, j, n = arr.length;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                int temp;
                if (arr[j-1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
