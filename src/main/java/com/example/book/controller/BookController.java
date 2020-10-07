package com.example.book.controller;


import com.example.book.entity.Book;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/findAll")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id")  int id){
        return bookService.deleteBook(id);
    }






}
