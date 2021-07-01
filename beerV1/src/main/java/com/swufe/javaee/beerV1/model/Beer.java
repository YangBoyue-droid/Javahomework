package com.swufe.javaee.beerV1.model;

public class Beer {
    String brand;
    double size;
    int year_of_birth;
    int harm;//喝酒的危害

    public Beer(String brand, double size, int  year_of_birth,int harm) {
        this.brand = brand;
        this.size = size;
        this.year_of_birth = year_of_birth;
        this.harm = harm;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setYear_of_birth(int year_of_birth){
        this.year_of_birth = year_of_birth;
    }

    public int getYear_of_birth(){
        return year_of_birth;
    }

    public void setHarm(int harm){
        this.harm = harm;
    }

    public int getHarm(){
        return harm;
    }
    @Override
    public String toString() {
        return (brand+"<br>"+"brand is:"+brand+"<br>"+"size is:"+size+"<br>"+"year is:"+year_of_birth+"<br>"+" harm is:"+harm);
    }
}
