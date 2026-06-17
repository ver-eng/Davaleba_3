package org.example;

public class RemovingDigits {
    public static void main(String[] args) {
        System.out.println( removeDigits("veriko123skfjs/15m"));
    }

    public static String removeDigits(String input){

        for(int i=0;i<input.length();i++){
            if (Character.isDigit(input.charAt(i))){
                char symbol=input.charAt(i);
                input= input.replace(String.valueOf(symbol), "");
                i--;
            }
        }
        return input;
    }
}
