package com.example.book.service;

import com.example.book.entity.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService{




    Map<Integer, Book> booKRepo = new HashMap<>();


    //booKRepo.put(1,new Book(id ,author, name));

    public Book getBook(int id){
        return (Book) booKRepo.get(id);
    }

    public Book addBook(Book book){
        return  booKRepo.put(book.getBookId(),book);

    }

    public Book updateBook(int id,Book book){
       Book existingBook= (Book) booKRepo.get(id);
       existingBook.setBookName(book.getBookName());
       existingBook.setBookAuthor(book.getBookAuthor());
       return (Book) booKRepo.put(id,existingBook);

    }
    //public List<String> getAll(){
        //return booKRepo.keySet().stream()
               // .map((key) -> key + ": " + booKRepo.get(key))
                //.collect(Collectors.toList());
   // }








}
