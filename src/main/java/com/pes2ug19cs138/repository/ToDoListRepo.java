package com.pes2ug19cs138.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pes2ug19cs138.entity.Task;

@Repository
public interface ToDoListRepo extends JpaRepository<Task, Integer> {

}
