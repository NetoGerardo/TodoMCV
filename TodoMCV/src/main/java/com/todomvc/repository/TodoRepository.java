package com.todomvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.todomvc.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
	
	@Query("select t from Todo t where t.completed =:completed")
	public  List<Todo> findByCompleted(@Param ("completed") boolean active);

}
