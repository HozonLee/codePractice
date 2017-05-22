package cn.iwangxin.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by 汪欣 on 2017/05/08.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println(getuniq(str));
        }
    }

    public static String getuniq(String str){
        LinkedHashSet<Character> set = new LinkedHashSet();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        for(char c : set){
            sb.append(c);
        }
        return sb.toString();
    }
}
