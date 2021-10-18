package com.method;



/**
 * 翻转数字
 *
 * @author songchao
 * @date 2021/10/18 10:59
 */
public class Method4 {
    public static void main(String[] args) {
        int i = minInteger2(134);
        System.out.println(i);
    }

    public static int minInteger(int num) {
        try {
            if (num > 0) {
                StringBuffer str = new StringBuffer(String.valueOf(num));
                String string = str.reverse().toString();
                return Integer.parseInt(string);
            }
            if (num < 0) {
                String s = String.valueOf(num);
                StringBuffer str = new StringBuffer(s.substring(1, s.length()));
                int i = Integer.parseInt(str.reverse().toString());
                return -i;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static int minInteger2(int num) {
        String string = String.valueOf(num);
        int flag=1;
        if (num < 0) {
            flag = -1;
            string = string.substring(1);
        }
        try {
            return   Integer.parseInt((new StringBuffer(string)).reverse().toString())*flag;
        }catch (Exception e){
            return 0;
        }

    }

}
