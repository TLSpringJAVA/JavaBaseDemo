package com.anlu.string;

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


        String[] ps = new String[2];
        ps[0] = "abc+";
        ps[1] = "abc?";
        testRegular(ps,"ab");
    }


    public static void splitDemo(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void replacing(){
       String result = knights.replaceFirst("f\\w+","located");
       System.out.println(result);
       System.out.println(knights.replaceAll("shrubbery|tree|herring","banana"));

    }

    public static void testRegular(String[] args,String targetStr){
        if(args.length<2){

        }

        for (String arg: args) {
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(targetStr);
            while (m.find()){
                System.out.println("正则表达式:"+arg+"->Match \""+m.group()+"\"+at positions "+ m.start()+"-"+(m.end()-1));
            }
        }
    }


}
