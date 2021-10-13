package com.method;

/**
 * 插入排序
 * @author songchao
 * @date 2021/10/12 11:18
 */
public class ChaRu {

    public static void main(String[] args) {
        int[] arr = new int[]{24, 12, 14, 66, 14, 15, 16, 66};
        chaRu(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    /**
     *插入排序   从小到大
     */
    private static void chaRu(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size-1; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
