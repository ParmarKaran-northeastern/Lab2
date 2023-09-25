package com.mycompany.lab2assisgnment;

import java.util.*;

public class Lab2assisgnment {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int sum = 0;
        int negativearry = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i <= n - 1; i++) {
            sum = arr[i];
            if (sum < 0) {
                    negativearry++;
                }
            
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    negativearry++;
                }
            }
        }
        System.out.println(negativearry);
    }
}
