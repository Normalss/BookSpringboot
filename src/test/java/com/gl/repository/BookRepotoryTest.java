package com.gl.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class BookRepotoryTest {

    @Autowired
    private BookRepotory bookRepotory;

    @Test
    void findAll(){
        System.out.println(bookRepotory.findAll());
    }
}