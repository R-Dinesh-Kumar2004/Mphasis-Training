package demo.spring_core.autowired.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.spring_core.java_config.JavaConfiguration;
import demo.spring_core.model.Student;

public class Ex04AutowiringJavaConfig {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Student student = context.getBean(Student.class);
		System.out.println(student);
	}

}
