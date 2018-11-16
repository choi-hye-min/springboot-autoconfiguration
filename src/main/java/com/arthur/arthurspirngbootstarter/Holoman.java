package com.arthur.arthurspirngbootstarter;

public class Holoman {

    String name;
    int howLong;

    String catName;
    int catAge;

    @Override
    public String toString() {
        return "Holoman{" +
                "name='" + name + '\'' +
                ", howLong=" + howLong +
                ", catName='" + catName + '\'' +
                ", catAge=" + catAge +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
