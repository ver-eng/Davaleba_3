package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {
    String title;
    double price;

    public ProductSorter(String title, double price){
        this.title=title;
        this.price=price;
    }
    @Override
    public String toString() {
//        return "Title: " + title + ", Price: " + price;
        return  title + " - " + price+" ₾";

    }
    public static void main(String[] args) {

        List<ProductSorter> products=new ArrayList<>();

        products.add(new ProductSorter("ბალი", 10));
        products.add(new ProductSorter("მარწყვი", 9));
        products.add(new ProductSorter("ალუჩა", 6.5));
        products.add(new ProductSorter("ყავა", 39));
        products.add(new ProductSorter("პური", 0.99));
        products.add(new ProductSorter("სდფსფსც", 12.99));
        products.add(new ProductSorter("უირეჰტ", 200));
        products.add(new ProductSorter("წერწსც", 0));




        products.sort((a,b)->Double.compare(a.price, b.price));
        System.out.println(products);

    }
}
