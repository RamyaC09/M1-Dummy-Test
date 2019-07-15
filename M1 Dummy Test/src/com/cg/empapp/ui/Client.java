package com.cg.empapp.ui;

import java.util.Scanner;

import com.cg.empapp.bean.Employee;
import com.cg.empapp.service.EmployeeServiceImpl;

//import ui.EmpRecords;

public class Client 
{
	static EmployeeServiceImpl es = new EmployeeServiceImpl();
	public static void main(String args[])
	{		
		Scanner sc = new Scanner(System.in);
		int ch;
		char choice;
		do
		{
			System.out.println(" 1. Add Employee \n 2. Get all Employee Details \n 3. Get Employee by Id \n 4. Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the id:");
				int empId = sc.nextInt();
				System.out.println("Enter the name:");
				String empName = sc.next();
				System.out.println("Enter the salary:");
				int empSal = sc.nextInt();
				Employee emp = new Employee(empId, empName, empSal);
				es.insertEmployee(emp);
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("Enter employee id to retrieve:");
				empId = sc.nextInt();
				break;
			case 4:
				System.out.println("END");
				System.exit(0);
		}
			System.out.println("Do you want to continue (y/n)");
			choice = sc.next().charAt(0);
			if(choice == 'Y' || choice == 'y')
				continue;
			else
			{
				System.out.println("Thank You");
				System.exit(0);
			}
		}while(ch!=3);
	}
}
