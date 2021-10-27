package com;



import org.apache.commons.lang3.StringUtils;

import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author songchao
 * @date 2021/10/14 9:14
 */
public class Test {
    public static void main(String[] args) {
        String s = "测试字符串方法{operId}的方法{operId2}";
        Map<Object,String> map = new HashMap<>();
        map.put("operId", "001");
        map.put("operId2", "002");

        String[] string = StringUtils.substringsBetween(s, "{", "}");
        for (int i = 0; i < string.length; i++) {
           s= s.replace("{"+string[i]+"}",map.get(string[i]));
        }
        System.out.println(s);

        System.out.println("------------------");

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

    }
}
