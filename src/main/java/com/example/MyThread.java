package com.example;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author songchao
 * @date 2021/9/17 21:15
 */
public class MyThread {
    public static void main(String[] args) {
        //    new Thread(new MyThread1()).start();
        List<String> list = new ArrayList();
        Collections.synchronizedList(list);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            },String.valueOf(i)).start();

        }

    }
}

class MyThread1 implements Runnable {


    @Override
    public void run() {
        System.out.println("打印");
    }
}
