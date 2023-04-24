package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee empById = communication.getEmployee(1);
        System.out.println(empById);

//        Employee emp = new Employee("Sveta", "Svetova", "TOP SECRET", 7000);
//        communication.saveEmployee(emp);

        Employee emp = new Employee("Sveta", "Svetova", "HOUSEKEEPER", 7000);
        emp.setId(7);
        communication.saveEmployee(emp);

        communication.deleteEmployee(7);
    }
}
