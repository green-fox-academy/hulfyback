package com.greenfoxacademy.todo.repositories;

import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
