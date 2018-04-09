package com.rcsit.zf;

/**
 * Created by Fun on 2018/4/7.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.print("Hellow："+name);
    }
}
