package in.nit.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import in.nit.model.Student;

@Component
public class StudentValidator implements Validator{

	/**
	 * Which model class object is allowed here!
	 */
	public boolean supports(Class<?> classType) {
		//Allow only Student class objects
		return Student.class.isAssignableFrom(classType);
	}

	public void validate(Object target, Errors errors) {
		//target => Model class object
		Student s=(Student)target;
		
		//---------------Write Validation code------------------//
		//No Null value + No Empty String 
		// JDK 1.8 => empty check->"".equals(s.getStdName().trim())
		//if(s.getStdName() ==null || s.getStdName().isBlank()) {  java 11 features of isBlank( ) method
			if(s.getStdName() ==null || " ".equals(s.getStdName())) {
			errors.rejectValue("stdName", null,"Please Enter Student Name!");
		}
		else if(!Pattern.matches("[A-Z]{2,8}", s.getStdName())) {
			errors.rejectValue("stdName", null,"Only 2-8 Uppercase letters");
		}
		
		
		//validate null and empty check
		//if(s.getStdGen()==null || s.getStdGen().isBlank()) {
			if(s.getStdGen()==null || " ".equals(s.getStdGen())) {
			errors.rejectValue("stdGen", null,"Please Choose Gender!");
		}


		//No Null value + No Empty String 
		//if(s.getStdPwd()==null || s.getStdPwd().isBlank()) { java 11 features
		if(s.getStdPwd() ==null || " ".equals(s.getStdPwd())) {

			errors.rejectValue("stdPwd", null,"Please Enter Password!");
		}

		//No Null value + No Empty String 
		//if(s.getStdCourse()==null || s.getStdCourse().isBlank()) {
			if(s.getStdCourse()==null || " ".equals( s.getStdCourse())) {
			errors.rejectValue("stdCourse", null,"Choose one Course!");
		}

		//No Null value + No Empty String 
		//if(s.getStdAddr()==null || s.getStdAddr().isBlank()) {
			if(s.getStdAddr()==null || " ".equals( s.getStdAddr())) {
			errors.rejectValue("stdAddr", null,"Address can not be empty");
		}
		else if(!Pattern.matches("[A-Za-z0-9\\s\\.\\-\\,]{10,100}",s.getStdAddr())) {
			errors.rejectValue("stdAddr", null,"Enter Address 10-100 chars!");
			
		}
		
		//checkbox validation (List validation)
		if(s.getStdLangs()==null || s.getStdLangs().isEmpty()) {
			errors.rejectValue("stdLangs", null,"Please choose atleast one option!");
		}
	}


}
