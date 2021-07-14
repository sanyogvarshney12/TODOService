package com.todo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.todo.model.Task;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Mongo Repository
 * @created 2021/07/14
 *
 */
public interface TaskRepository extends MongoRepository<Task, String>{

	List<Task> findByUserName(String userName);
}
