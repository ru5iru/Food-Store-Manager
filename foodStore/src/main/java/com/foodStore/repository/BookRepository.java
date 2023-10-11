package com.foodStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}