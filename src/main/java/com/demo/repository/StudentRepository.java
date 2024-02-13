package com.demo.repository;//3rd Repository layer.

import org.springframework.data.repository.CrudRepository;//spring boot  Repository

import com.demo.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {//ID ko Integer me badl do.

	

}
