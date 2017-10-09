package com.anlu.string;

import java.util.Formatter;

public class StringDemo {
    public static void main(String[] args){
        Formatter f = new Formatter(System.out);
        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %s \n",u);
    }
}
