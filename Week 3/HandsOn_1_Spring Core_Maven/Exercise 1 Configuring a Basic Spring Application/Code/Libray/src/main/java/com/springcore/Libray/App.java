package com.springcore.Libray;
import com.springcore.Libray.repository.*;
import com.springcore.Libray.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	 BookRepository obj2=(BookRepository)context.getBean("bookrepo");
    	 obj2.getrepo();
    	 
    	 
    	 BookService obj1=(BookService)context.getBean("bookservice");
    	 obj1.getBooks();

    }
}
