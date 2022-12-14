package com.mgnrega.usecases;

import java.util.List;
import java.util.Scanner;

import com.mgnrega.dao.BdoDao;
import com.mgnrega.dao.BdoDaoImple;
import com.mgnrega.dao.GpmDao;
import com.mgnrega.dao.GpmDaoImpl;
import com.mgnrega.exceptions.BDOException;
import com.mgnrega.exceptions.EmployeeException;
import com.mgnrega.exceptions.ProjectException;
import com.mgnrega.modal.Bdo;
import com.mgnrega.modal.EmpDTO;
import com.mgnrega.modal.Employee;

public class GetEmployeebyPhone {
	public static void main(String[] args) {
		
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Employee Mobile NUmber");
		
		String cname= sc.next();

		GpmDao dao = new GpmDaoImpl();
		
		try {
		List<Employee> dtos= dao.getEmployeeByMobile(cname);
		
		dtos.forEach(dto -> System.out.println(dto));
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
	}
}
