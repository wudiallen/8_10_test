package com.method;

/**
 * 山脉数组  找到山峰的下标
 *
 * @author songchao
 * @date 2021/10/15 15:51
 */
public class Method3 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 3, 0};
        int i = shanMai(arr);
        System.out.println(i);
    }

    private static int shanMai(int arr[]) {
        int num = 0;
        int max = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else {
                num = i - 1;
                break;
            }
        }
        return num;
    }
    private static int shanMai1(int arr[]) {
        int num =0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                num = i;
                break;
            }
        }
        return num;
    }
}
