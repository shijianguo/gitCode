package com.example.demo;

import java.io.Serializable;

public class SpringBootProcessor implements Serializable{
    public static ThreadLocal<String> threadLocal=new ThreadLocal<>();
}
