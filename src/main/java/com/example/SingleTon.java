package com.example;

/**
 * 饿汉模式
 * @author songchao
 * @date 2021/8/18 14:16
 */
public class SingleTon {
    public SingleTon(){};
    private static SingleTon singleTon = new SingleTon();
    public SingleTon getSingleTon(){
        return singleTon;
    }
}
