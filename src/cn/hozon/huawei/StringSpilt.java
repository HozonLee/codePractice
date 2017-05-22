package cn.iwangxin.huawei;

import java.util.Scanner;

/**
 * Created by 汪欣 on 2017/03/24.
 */
public class StringSpilt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = null;
        String str2 = null;
        while(sc.hasNext()){
            str1 = sc.next();
            str2 = sc.next();
            break;
        }

        for(int i = 0;i < str1.length()/8 + 1;i++){
            for(int j = 0;j < 8;j++){
                if(i * 8 + j >= str1.length() &&j != 0){
                    System.out.print(0);
                }
                    else System.out.print(str1.charAt(i * 8 +j ));
            }
            System.out.println();
        }

        for(int i = 0;i < str2.length()/8 + 1;i++){
            for(int j = 0;j < 8;j++){
                if(i * 8 +j >= str2.length() && j != 0){
                    System.out.print(0);
                }
                else System.out.print(str2.charAt(i * 8 + j ));
            }
            System.out.println();
        }

    }

}
