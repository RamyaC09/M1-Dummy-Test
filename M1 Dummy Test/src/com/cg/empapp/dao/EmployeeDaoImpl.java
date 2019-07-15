package com.cg.empapp.dao;

import java.util.HashMap;

import com.cg.empapp.bean.Employee;
import com.cg.empapp.exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao
{
	HashMap<Integer,Employee> map = new HashMap<Integer,Employee>();
	@Override
	public void insertEmployee(Employee emp) 
	{
		// TODO Auto-generated method stub
		map.put(emp.getEmpId(), emp);
		System.out.println("Added..");
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() throws EmployeeException 
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException
	{
		Employee emp = map.get(id);
		// TODO Auto-generated method stub
		if(map.containsKey(id))
		{
			System.out.println(emp);
		}
		else
		{
			throw new EmployeeException("There is no such employee with that id");
		}
		return emp;
	}
	
}
