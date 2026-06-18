package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeorgianCityGenerator {
    String city;
    String region;

    public GeorgianCityGenerator(String city, String region){

        this.city=city;
        this.region=region;

    }
    @Override
    public String toString(){
        return city+" - "+region;
    }
    public static void main(String[] args) {

        List<GeorgianCityGenerator> cities=new ArrayList<>();

        cities.add(new GeorgianCityGenerator("თბილისი", "ქართლი"));
        cities.add(new GeorgianCityGenerator("რუსთავი", "ქვემო ქართლი"));
        cities.add(new GeorgianCityGenerator("ბათუმი", "აჭარა"));
        cities.add(new GeorgianCityGenerator("ქუთაისი", "იმერეთი"));
        cities.add(new GeorgianCityGenerator("თელავი", "კახეთი"));

        System.out.println(getRandomCity(cities));
    }


    public static String getRandomCity(List cities){
        String randomCity=cities.get(new Random().nextInt(cities.size())).toString();
        return randomCity;

    }
}
