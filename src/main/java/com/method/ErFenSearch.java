package com.method;

/**
 * 二分查找
 *
 * @author songchao
 * @date 2021/10/9 15:31
 */
public class ErFenSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 44, 56, 345, 346, 445, 449, 543, 566, 568, 600, 666,1212,1213,1214,1215,1222,1223,1224,1225,1226,1227};
        Integer integer = erFenSearch(arr, 449);
        System.out.println(integer);
    }

    private static Integer erFenSearch(int[] arr, int num) {
        //初始
        int lo = 0;
        //最后
        int hi = arr.length - 1;
        //中间数
        int mid ;

        while (lo <= hi) {
            mid  = (lo+hi)/2;
            //传入的数比中间数大
            if (arr[mid] < num) {
                lo = mid + 1;
            }
            //传入的数比中间数小
            if (arr[mid] > num) {
                hi = mid - 1;
            }
            if (arr[mid] == num) {
                return mid+1;
            }

            System.out.println("正在计算"+lo+" "  +hi);
        }
        return -1;
    }
}
