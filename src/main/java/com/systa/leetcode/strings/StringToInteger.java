package com.systa.leetcode.strings;

public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger sti = new StringToInteger();
        System.out.println(sti.myAtoi("    -901abcd"));
    }

    public int myAtoi(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }

        int index = 0;
        while(index < s.length() && s.charAt(index) ==  32){
            index++;
        }

        if(index >= s.length()){
            return 0;
        }
        int sign = 1;
        if(s.charAt(index) == 45){
            index++;
            sign = -1;
        }

        int number = 0;
        while(index < s.length() && s.charAt(index) >= 48 && s.charAt(index) <= 57){
            int numberAtPosition = s.charAt(index) - '0';
            number = (number * 10) + numberAtPosition;
            index++;
        }
        return number*sign;
    }
}
