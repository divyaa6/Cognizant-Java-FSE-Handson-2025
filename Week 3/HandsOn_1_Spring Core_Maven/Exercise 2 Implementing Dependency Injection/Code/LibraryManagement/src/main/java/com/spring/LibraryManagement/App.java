package com.spring.LibraryManagement;

//import com.spring.LibraryManagement.repository.*;
import com.spring.LibraryManagement.service.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        BookService book1=(BookService)context.getBean("bookService");
        book1.showBooks();
    }
}
