package com.example.book.controller;


import com.example.book.entity.Book;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/find/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookService.getBook(id);
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@RequestBody Book book,@PathVariable("id") int id){
        return bookService.updateBook(id, book);
    }
    //@GetMapping("/findall")
    //public Iterable<Book> getAll(){
       // return bookService.getAll();
    //}







}
