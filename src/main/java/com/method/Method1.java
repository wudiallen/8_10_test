package com.method;

import java.util.SortedMap;

/**
 * 题目:在一个二维数组中,每一行都按照从左到右递增的顺序排序,每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数,输入这样的个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author songchao
 * @date 2021/10/14 9:34
 */
public class Method1 {
    public static void main(String[] args) {
        //二维数组
        int[][] arr = new int[][]{{1, 4, 6, 7}, {2, 6, 7, 9}, {6, 10, 11, 13}, {9, 11, 12, 15}};
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        boolean b = method1(arr, 98);
        System.out.println(b);
    }

    /**
     * 判断函数中  有没有num
     */
    private static  boolean method1(int[][] arr, int num) {
        boolean find = false;
        //列
        int column = arr[0].length - 1;
        //行
        //int row = arr.length-1;
        int row = 0;
        while (column >= 0 && (row <= arr.length - 1)) {
            if (arr[row][column] == num) {
                //找到
                find = true;
                return find;
            } else if (arr[row][column] < num) {
                row++;
            }else {
                column--;
            }
        }
        return find;
    }

}
