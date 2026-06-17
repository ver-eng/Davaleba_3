package org.example;

import java.util.Arrays;
import java.util.Random;

public class WeatherStats {
    public static void main(String[] args) {

        int minTemperature=-30;
        int maxTemperature=50;
        int[] temperatureList=new int[30];

        for(int i=0;i<temperatureList.length;i++){
            temperatureList[i]=new Random().nextInt(maxTemperature-minTemperature+1) +minTemperature;;

        }
        System.out.println(Arrays.toString(temperatureList));
        System.out.println(printStats(temperatureList));
    }
    public static String printStats(int[] arr){
            int minValue=arr[0];
            int maxValue=arr[0];
            float average=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<minValue){
                minValue=arr[i];
            }
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
            average+=arr[i];
        }

        return "მინიმალური ტემპერატურა იყო "+minValue+", მაქსიმალური "+maxValue+", და საშუალო "+average/arr.length+".";

    };

}
