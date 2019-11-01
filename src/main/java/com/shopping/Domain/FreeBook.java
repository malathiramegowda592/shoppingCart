package com.shopping.Domain;

import com.shopping.Domain.Book;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class FreeBook extends Book {

    double fbprice = 0;

    public FreeBook(){

    }


    public FreeBook(long id, String name, String description, double price) {

        super(name, description, price);
    }

    @Override
    public double setPrice(double price) {
        return price * fbprice;
        //super.setPrice(price)*0;
    }



    public double getPrice() {
        return setPrice(fbprice);
    }
}

