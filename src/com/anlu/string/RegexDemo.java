package com.anlu.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static String knights = "Then, when you have found the shrubbery,you must" +
            " cut down the mightiest tree in the forest..." +
            " with ... a herring!";
    public static void main(String[] args){
//        System.out.println("-1234".matches("-?\\d+"));
//        System.out.println("5678".matches("-?\\d+"));
//        System.out.println("+911".matches("-?\\d+"));

//        splitDemo(" " );
//        splitDemo("\\W+");
//        splitDemo("n\\W+");

//        replacing();


//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("abc+");
//        arrayList.add("^123");
//
//        testRegular(arrayList,"123");


        testFlagReg();
    }


    public static void splitDemo(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void replacing(){
       String result = knights.replaceFirst("f\\w+","located");
       System.out.println(result);
       System.out.println(knights.replaceAll("shrubbery|tree|herring","banana"));

    }

    public static void testRegular(ArrayList<String> args,String targetStr){
        for (String arg: args) {
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(targetStr);
            while (m.find()){
                System.out.println("正则表达式:"+arg+"->Match \""+m.group()+"\"+at positions "+ m.start()+"-"+(m.end()-1));
            }
        }
    }

    /**
     * pattern的标记
     * 你还可以通过或| （|）操作符组合多个标记的功能
     * Pattern.CASE_INSENSITIVE 这个模式表示匹配忽略大小写
     * Pattern.MULTILINE 在多行模式下，表达式^和$分别匹配一行的开始和结束
     */
    public static void testFlagReg(){
       Pattern p = Pattern.compile("^java",Pattern.CASE_INSENSITIVE );
       Matcher m = p.matcher("java has regex \n JAVA has regex \n" +
               "Java has a pretty good regular expression\n" +
               "Regular expressions are in Java");
       while (m.find()){
           System.out.println(m.group());
       }
    }




}
