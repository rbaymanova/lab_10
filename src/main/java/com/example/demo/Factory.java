package com.example.demo;

public class Factory<T> {
    public T create(Class<T> tClass){
        try {
            return tClass.getDeclaredConstructor().newInstance();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
