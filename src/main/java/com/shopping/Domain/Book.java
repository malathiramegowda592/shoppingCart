package com.shopping.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
public class Book {


    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)  private Long id;
    private int id;
    private String title;
    private String author;
    private String name;
    @Max(value = 100000)
    private String description;


    private String isbn;
    //    protected double price;
    //private String
    protected static final String SEARCH_ID = "id";
    protected static final String SEARCH_NAME = "name";
    protected static final String SEARCH_DESCRIPTION = "description";


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(int id, String isbn, String title, String description, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.author = author;
    }
//
//    public abstract int getNumOfCopies() ;
//
//    public abstract void setNumOfCopies(int numOfCopies) ;

    //protected int numOfCopies;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public double setPrice(double price) {
//        this.price = price;
//        return price;
//    }

    public Book() {
        this.id=0;
        this.isbn="";
        this.title = "";
        this.description = "";
        this.author ="";
    }
//    public Book(String name, String description, double price) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//    }

    public String toString() {
        return "id: " + id + " title:" + title + " description:" + description + " author: " +
                author;
    }

}
