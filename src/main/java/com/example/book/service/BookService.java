package com.example.book.service;

import com.example.book.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService{




    Map<Integer, Book> booKRepo = new HashMap<>();




    //booKRepo.put(1,new Book(id ,author, name));

    public Book getBook(int id){
        return (Book) booKRepo.get(id);
    }

    public Book addBook(Book book){
          booKRepo.put(book.getBookId(),book);
          return book;

    }

    public Book updateBook(int id,Book book){
       Book existingBook= (Book) booKRepo.get(id);
       existingBook.setBookName(book.getBookName());
       existingBook.setBookAuthor(book.getBookAuthor());
       return (Book) booKRepo.put(id,existingBook);

    }
    public List<Book> getAll(){
        List<Book> bookList = new ArrayList<Book>();
          for(Book book:booKRepo.values()) {  
              bookList.add(book);
          }
          return bookList;


    }








}
