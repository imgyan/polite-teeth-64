package com.mgnrega.dao;

import java.util.ArrayList;
import java.util.List;

import com.mgnrega.exceptions.EmployeeException;
import com.mgnrega.exceptions.GpmException;
import com.mgnrega.exceptions.ProjectException;
import com.mgnrega.modal.EmpDTO;
import com.mgnrega.modal.Employee;
import com.mgnrega.modal.Gpm;

public interface GpmDao {
	
    public Gpm loginGPM(String username, String password)throws GpmException;
    
	public String registerEmployee(int eid, String ename, String emobile, String eaddress, int etotaldaywork, String ewages);

	public List<Employee> getAllEmp()throws EmployeeException;
	
	public String registerEmployeeToProject(int pid, int eid)throws ProjectException, EmployeeException ;

	public List<Employee>  getEmployeeByMobile(String emobile)throws ProjectException, EmployeeException;
     
	

}
