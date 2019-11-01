package com.shopping;

import com.shopping.Domain.Book;
import com.shopping.Domain.FreeBook;
import com.shopping.Services.FreeBookService;
import javassist.ClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;

import java.io.*;

@Component
public class DataLoader {

    @Autowired
    private FreeBookService freeBookService;

    @Value("classpath:File/InputFile")
    private Resource resource;// Resource identifies the data /image file

    @PostConstruct
    public void loadData() throws IOException {
        readFile();

    }



    public void readFile() throws IOException {

        String line;
        String lineArray[] = {};

            BufferedReader bufferReader;
        try {
            bufferReader = new BufferedReader(new FileReader(resource.getFile()));
            //bufferReader = new BufferedReader(new InputStreamReader((resource.getInputStream())));
            line = bufferReader.readLine();
            while(line != null) {
                line = bufferReader.readLine();
                if(line!=null)
                    lineArray = line.split("    ");
            }
            System.out.println(lineArray);

            Book book=new Book(Integer.parseInt(lineArray[0]),lineArray[1], lineArray[2],lineArray[3],lineArray[4]);
            freeBookService.save(book);


        } catch (IOException e) {
            e.printStackTrace();
        }

//        Book freeBook1 = new Book();
//        freeBook1.setPrice(0);
//        freeBook1.setName("book1");
//        freeBook1.setDescription("novel");
//        Book freeBook2 = new Book("book2", "novel", 0);
//        Book freeBook3 = new Book("book3", "novel", 0);
//        Book freeBook4 = new Book("book3", "novel", 0);
//
//        freeBookService.save(freeBook1);
//        freeBookService.save(freeBook2);
//        freeBookService.save(freeBook3);
//        freeBookService.save(freeBook4);
//
//        Book schoolBook = new Book();
//        schoolBook.setPrice(0);
//        schoolBook.setName("book1");
//        schoolBook.setDescription("novel");
//
//
//        Book schoolBook1 = new Book("book2", "novel", 0);
//        Book schoolBook2 = new Book("book3", "novel", 0);
//        Book schoolBook3 = new Book("book3", "novel", 0);
//
//        freeBookService.save(schoolBook1);
//        freeBookService.save(schoolBook2);
//        freeBookService.save(schoolBook3);

        }

    }
