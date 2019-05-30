package com.greenfoxacademy.mysql.repositories;

import com.greenfoxacademy.mysql.models.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepository extends CrudRepository<Todo, Long> {
  @Query(value = "SELECT * FROM todo ORDER BY Id DESC ", nativeQuery = true)
  List<Todo> findAllOrderByIdDesc();
  @Query(value = "SELECT * FROM todo ORDER BY Id", nativeQuery = true)
  List<Todo> findAllOrOrderById();
  List<Todo> findAllByTitleContaining(String string);
}
