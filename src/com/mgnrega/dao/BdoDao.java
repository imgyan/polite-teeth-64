package com.mgnrega.dao;

import java.util.List;

import com.mgnrega.exceptions.BDOException;
import com.mgnrega.exceptions.GpmException;
import com.mgnrega.exceptions.ProjectException;
import com.mgnrega.modal.Bdo;
import com.mgnrega.modal.EmpDTO;
import com.mgnrega.modal.Gpm;
import com.mgnrega.modal.Project;

public interface BdoDao {
	
     public Bdo loginBDO(String username, String password)throws BDOException;
	
	public String createProject(int pid, String pname, String pcost, String pissuedate);
	
	public List<Project> getAllProjectDetails()throws ProjectException;

	public String registerGPM(int gid, String gname, String gemail, String gpassword, String phone, String gaddress, int bdoid);

	public List<Gpm> getAllGPM()throws GpmException;
	
	
	public String AssignProjectToGPM(int pid, int gid)throws GpmException,ProjectException ;
	
	public List<EmpDTO> getAllEmployeeByPname(String pname)throws ProjectException;

	


}