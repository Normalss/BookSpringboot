package com.gl.controller;

import com.gl.entity.Book;
import com.gl.repository.BookRepotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookHandler {

    @Autowired
    private BookRepotory bookRepotory;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page,@PathVariable("size") Integer size) {
        Pageable pageable = PageRequest.of(page-1, size);
        return bookRepotory.findAll(pageable);
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book){
        Book result = bookRepotory.save(book);
        if (result!=null){
            return "success";
        }else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Integer id){
        return bookRepotory.findById(id).get();

    }

    @PutMapping("/update")
    public String update(@RequestBody Book book){
        Book result = bookRepotory.save(book);
        if (result!=null){
            return "success";
        }else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
         bookRepotory.deleteById(id);

    }

}
