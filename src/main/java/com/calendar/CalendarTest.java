package com.calendar;

import com.TestInterfave;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author songchao
 * @date 2021/9/28 15:49
 */
public class CalendarTest implements TestInterfave {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate date2 = LocalDate.now();
        System.out.println(date2);
        String format = date2.format(dateTimeFormatter);

        System.out.println(format);
    }

    @Override
    public void eat() {
        System.out.println("在吃饭");
    }
}
