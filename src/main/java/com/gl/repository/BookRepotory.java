package com.gl.repository;

import com.gl.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepotory extends JpaRepository<Book,Integer> {

}
