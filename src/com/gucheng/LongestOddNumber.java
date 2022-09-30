package com.gucheng;

import java.util.ArrayList;

public class LongestOddNumber {
    public static void main(String[] args) {
        System.out.println("odd is " + largestOddNumber("1"));
    }

    public static String largestOddNumber(String num) {
        if (num == null || num.length() == 0) {
            return "";
        }
        int length = num.length();
        int subLength = length;
        ArrayList<Integer> list = new ArrayList<>();
        boolean find = false;
        String temp = "0";
        int i=length-1;
        for (;i>=0;i--) {
            temp = num.substring(i, i + 1);
            int a = Integer.parseInt(temp);
            if (a % 2 != 0) {
                break;
            }
        }
        int a = Integer.parseInt(temp);
        String odd = "";
        if (i == 0 && a % 2 == 0) {

        } else {
            odd = num.substring(0,i+1);
        }
        return odd;

    }
}
