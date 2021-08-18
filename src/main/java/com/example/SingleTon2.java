package com.example;

/**
 * 懒汉模式
 * @author songchao
 * @date 2021/8/18 14:16
 */
public class SingleTon2 {
    public SingleTon2(){};
    private static SingleTon2 singleTon2;
    public SingleTon2 getSingleTon(){
        if (singleTon2 == null){
            return new SingleTon2();
        }
        return singleTon2;
    }
}
