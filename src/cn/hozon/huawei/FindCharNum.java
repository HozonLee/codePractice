package cn.iwangxin.huawei;

import java.util.Scanner;

/**
 * Created by 汪欣 on 2017/03/24.
 */
public class FindCharNum {
    public static void main(String[] args){
        String str = null;
        String findStr = null;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        findStr = sc.next();
        for(int i = 0;i < str.length();i++){
            if(str.toLowerCase().charAt(i) == findStr.toLowerCase().charAt(0)){
                count++;
            }
        }
//        for(int i = 0; i< string.length;i++){
//            System.out.println(string[i]);
//        }
        System.out.println(count);
    }
}
