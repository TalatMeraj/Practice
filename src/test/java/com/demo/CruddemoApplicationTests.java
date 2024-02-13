 package com.demo;//4 junit..

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {
	private static final Logger logger =LoggerFactory.getLogger(CruddemoApplicationTests.class);
	
	@Autowired
	private StudentRepository StudentRepo;//object

	@Test
	void saveStudent() {
		logger.info("class CruddemoApplicationTests-->method name saveStudent()");
		//logger.error("This is an error message");
//		Student s= new Student();  -> entity class name
//		s.setName("mango");
//		s.setCourse("testing");
//		s.setFee(5000);
		try {
			int x=10/0;
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
		
	}	
		// StudentRepo.save(s);  ->save the data.
		// logger.info("Second");
		// logger.error("This is an error message");
		 

//	@Test
//	public void deleteStudentInformation() {//select delete and run..
//		logger.info("class CruddemoApplicationTests-->method name deleteStudentInformation()");
//
//		StudentRepo.deleteById(3);
//	}	
	@Test
	public void findStudentById() {//select & run..is check id is there are not
		logger.info("class CruddemoApplicationTests-->method name findStudentById()");

		Optional<Student> findById=StudentRepo.findById(1);//to avaoid null pointer exception we use optional class because 
		//O.class  can check is there any content are reference variable or not no contenet then not use content then use.. 
	
		//	System.out.println(findById.isPresent());
		if(findById.isPresent()) {//use logic 
			Student student = findById.get();  //entity go to optional and op go db..
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getCourse());
			System.out.println(student.getFee());

		}else {
			System.out.println("No Record Found");
		}
	}
	@Test
	public void updateStudentInfo() {//select & run 
		logger.info("class CruddemoApplicationTests-->method name updateStudentInfo()");

		Optional<Student> obj=StudentRepo.findById(1);
		Student student = obj.get();
		student.setFee(6000);
		StudentRepo.save(student);

	}
	@Test
	public void findStudentExist() {  //record is exist are not check..
		logger.info("class CruddemoApplicationTests-->method name findStudentExis()");

		boolean val= StudentRepo.existsById(1);
		System.out.println(val);
	}
	@Test
	public void getAllRecords() {//all record show..select then run.
		logger.info("class CruddemoApplicationTests-->method name getAllRecords()");

		Iterable<Student> findAll=StudentRepo.findAll();
		for(Student student : findAll) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getCourse());
			System.out.println(student.getFee());
		}
	}

}

