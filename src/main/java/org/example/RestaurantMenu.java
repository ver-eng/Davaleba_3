package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantMenu {

    public static void main(String[] args) {

        Map<String, List<String>> menuItems=new HashMap<>();

        menuItems.put("სტარტერი", List.of("მოცარელას ჩხირები", "ხახვის რგოლები", "ქათმის ფრთები")) ;
        menuItems.put("დესერტი", List.of("ბრაუნი", "ნაყინი", "პანაკოტა"));
        menuItems.put("წვნიანი", List.of("სოკოს სუპი", "ოსპის წვნიანი", "ქათმის წვნიანი"));

        printMenuForCategory(menuItems.get("დესერტი").toString());
        printMenuForCategory(menuItems.get("სტარტერი").toString());


    }

    public static void printMenuForCategory( String category){
        System.out.println(category);
    }
}
