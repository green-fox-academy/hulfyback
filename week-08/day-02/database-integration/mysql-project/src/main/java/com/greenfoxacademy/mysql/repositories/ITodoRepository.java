package com.greenfoxacademy.mysql.repositories;

import com.greenfoxacademy.mysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ITodoRepository extends CrudRepository<Todo, Long> {

}
