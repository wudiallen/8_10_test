package com.method;


/**
 * 翻转数字
 *
 * @author songchao
 * @date 2021/10/18 10:59
 */
public class Method4 {
    public static void main(String[] args) {
        int i = minInteger(-1134);
        System.out.println(i);
    }

    public static int minInteger(int num) {
        String s = String.valueOf(num);
        int flag = 1;
        if (num < 0) {
            s = s.substring(1);
            flag = -1;
            System.out.println(s);
        }
        try {
            return Integer.parseInt(new StringBuffer(s).reverse().toString()) * flag;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int minInteger2(int num) {
        String string = String.valueOf(num);
        int flag = 1;
        if (num < 0) {
            flag = -1;
            string = string.substring(1);
        }
        try {
            return Integer.parseInt((new StringBuffer(string)).reverse().toString()) * flag;
        } catch (Exception e) {
            return 0;
        }

    }

}
