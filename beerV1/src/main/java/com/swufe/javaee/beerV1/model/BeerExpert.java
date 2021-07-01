package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
/*    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jali Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
*/
    public List<Beer> getBeers(String color) {
        List<Beer> beers = new ArrayList<>();
        if(color.equals("brown")){
            beers.add(new Beer("茅台", 100.0,1985,3));
            beers.add(new Beer("五粮液", 500.0,1984,4));
        }else if(color.equals("amber")){
            beers.add(new Beer("1573", 100.0,1983,5));
            beers.add(new Beer("剑南春", 300.0,1982,6));
        }else{
            beers.add(new Beer("雪花啤酒", 100.0,2000,7));
            beers.add(new Beer("喜力啤酒", 200.0,2000,8));
        }
        return beers;
    }
}
