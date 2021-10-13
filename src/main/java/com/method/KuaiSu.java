package com.method;

/**
 * 快速排序
 *
 * @author songchao
 * @date 2021/10/12 20:15
 */
public class KuaiSu {
    public static void main(String[] args) {
        int[] arr = new int[]{24, 12, 14, 66, 14, 15, 16, 66, 100, 2, 121, 11};
        kuaiSuPaixu(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    private static void kuaiSuPaixu(int[] arr) {
        int len;
        if (arr == null || (len = arr.length) == 0 || len == 1) {
            return;
        }
        sort(arr, 0, len - 1);
    }

    private static void sort(int[] arr, int low, int heigh) {
        if (low > heigh) {
            return;
        }
        int start = low;
        int end = heigh;
        int key = arr[low];

        while (start != end) {
            while (arr[end] >= key && start < end) {
                end--;
            }
            while (arr[start] <= key && start < end) {
                start++;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        arr[low] = arr[start];
        arr[start] = key;
        sort(arr, low, start - 1);
        sort(arr, end + 1, heigh);

    }
}
