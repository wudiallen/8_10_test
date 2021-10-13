package com.method;

/**
 * 快速排序
 *
 * @author songchao
 * @date 2021/10/12 20:15
 */
public class KuaiSu {
    public static void main(String[] args) {
        int[] arr = new int[]{20,21,5,90,6};
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

        while (start < end) {
            while (arr[end] >= key && start < end) {
                end--;
            }
            while (arr[start] <= key && start < end) {
                start++;
            }
            //找到了 右边比key小的值，
            //找到了 左边比key大的值
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        // 将基准数放到中间的位置（基准数归位）
        arr[low] = arr[start];
        arr[start] = key;
        // 递归，继续向基准的左右两边执行和上面同样的操作
        // start的索引处为上面已确定好的基准值的位置，无需再处理 24, 12, 14, 66, 14, 15, 16, 66, 100, 2, 121, 11
        sort(arr, low, start - 1);
        sort(arr, start + 1, heigh);

    }
}
