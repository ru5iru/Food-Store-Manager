package com.foodStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodStore.entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}