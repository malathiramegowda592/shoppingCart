package com.shopping.Domain;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SchoolBook extends Book {

    private int numOfCopies;
    final static int FIRSTSTARTRNG = 5;
    final static int FIRSTENDRNG = 10;
    final static int SECONDSTARTRNG = 25;
    final static int SECONDENDRNG = 50;


    public SchoolBook(String name, String description, double price, int numOfCopies) {
        super(name, description, price);
        this.numOfCopies = numOfCopies;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    @Override
    public double getPrice() {

        if (numOfCopies >= FIRSTSTARTRNG && numOfCopies < FIRSTENDRNG) {
            return ((numOfCopies * price) - (numOfCopies * price * .10));
        } else if (numOfCopies >= FIRSTENDRNG && numOfCopies < SECONDSTARTRNG) {
            return ((numOfCopies * price) - (numOfCopies * price * .25));
        } else if (numOfCopies >= SECONDSTARTRNG) {
            return ((numOfCopies * price) - (numOfCopies * price * .50));
        } else return numOfCopies * price;
    }

    public String toString() {
        return super.toString() + " numOfCopies: " + numOfCopies;
    }
}



