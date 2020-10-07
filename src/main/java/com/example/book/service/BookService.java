package com.example.book.service;

import com.example.book.Dao.BookRepository;
import com.example.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService{

     @Autowired
     private BookRepository booKRepo;

    //Map<Integer, Book> booKRepo = new HashMap<>();




    //booKRepo.put(1,new Book(id ,author, name));

    public Book getBook(int id){
        return booKRepo.findById(id).get();
    }

    public Book addBook(Book book){
          booKRepo.save(book);
          return book;

    }

    public Book updateBook(int id,Book book){
       Book existingBook= (Book) booKRepo.findById(id).get();
       existingBook.setBookName(book.getBookName());
       existingBook.setBookAuthor(book.getBookAuthor());
       return booKRepo.save(existingBook);

    }
    public List<Book> getAll(){
        return booKRepo.findAll();


    }

    public String deleteBook(int id){
        booKRepo.deleteById(id);
        return "book deleted";
    }








}
