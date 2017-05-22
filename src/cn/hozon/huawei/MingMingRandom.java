package cn.iwangxin.huawei;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by 汪欣 on 2017/03/24.
 */
public class MingMingRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<Integer>();
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        for(int i = 0;i< arr.length;i++){
            System.out.println(Integer.parseInt((String) arr[i]));
        }
    }
}
