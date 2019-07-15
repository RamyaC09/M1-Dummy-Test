package com.cg.empapp.service;

import java.util.HashMap;
import java.util.Scanner;

import com.cg.empapp.bean.Employee;
import com.cg.empapp.dao.EmployeeDaoImpl;
import com.cg.empapp.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService
{
	EmployeeDaoImpl ed = new EmployeeDaoImpl();
	@Override
	public void insertEmployee(Employee emp)
	{
		
		ed.insertEmployee(emp);
		
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() throws EmployeeException
	{
		
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException 
	{
		Employee emp = ed.getEmployeeById(id);
		
		return emp;
	}
	
	public boolean isEmpNameValid(String empName)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			if(empName.length() >= 3 && Character.isUpperCase(empName.charAt(0)))
			{
				return true;
			}
			else
			{
				System.out.println("Name is invalid");
				System.out.println("Enter again");
				empName = sc.next();
			}
		}
	}
	

    public boolean isEmpSalValid(int empSal)
    {
    	Scanner sc = new Scanner(System.in);
    	while(true)
    	{
    		if(empSal > 0)
    		{
    			return true;
    		}
    		else
    		{
    			System.out.println("Salary should be greater than zero");
    			System.out.println("Enter again");
				empSal = sc.nextInt();
    		}
    	}
    }
	
}
