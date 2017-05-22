package cn.iwangxin.huawei;

/**
 * Created by 汪欣 on 2017/03/24.
 */

import java.util.Scanner;

public class StringLength{
    public static void main(String[] args){
        String str = new String();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            str = sc.next();
        }
        String[] string = str.split(" ");
//        for(int i = 0; i< string.length;i++){
//            System.out.println(string[i]);
//        }
        System.out.println(string[string.length -1].length());
    }
}
