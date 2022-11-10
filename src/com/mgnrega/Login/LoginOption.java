package com.mgnrega.Login;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mgnrega.*;
import com.mgnrega.usecases.AssignProjectToGpm;
//import com.mgnrega.usecases.AssignProjecttoEmp;
import com.mgnrega.usecases.CreateProject;
import com.mgnrega.usecases.GetAllEmployee;
import com.mgnrega.usecases.GetAllGpm;
import com.mgnrega.usecases.GetAllProjects;
import com.mgnrega.usecases.LoginGpm;
import com.mgnrega.usecases.RegistarEmpToProject;
import com.mgnrega.usecases.RegisterEmployee;
import com.mgnrega.usecases.RegisterGpm;
import com.mgnrega.usecases.getEmpByPname;

public class LoginOption {
	
	public static void bdo() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(""
				+ "      1. Create a project.\n"
				+ "      2. View List Of Project.\n"
				+ "      3. Create new Gram Panchayat Member(GPM).\n"
				+ "      4. View all the GPM.\n"
				+ "      5. Allocate Project to GPM.\n"
				+ "      6. get AllEmployee By Pname.\n"
				+ "      7. Go Back"
				          );
		System.out.println();
		System.out.println("Chose appropriate option from above");
		
		int bdochoise=0;
		
		try {
			bdochoise=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input! \n Please try again...");
			LoginOption.bdo();
		}
		
		switch(bdochoise) {
		case 1:
		     CreateProject.CProject();
			break;
		case 2:
            GetAllProjects.GAllProjects();		
			break;
		case 3:
			RegisterGpm.RGpm();
			break;
		case 4:
		GetAllGpm.GAllGpm();
			break;
		case 5:
			AssignProjectToGpm.ProjecttoGpm();
			break;
		case 6:
			getEmpByPname.getEmplPname();
			break;
	
		case 7:
			LoginOption.selectUser();
		}
		
		LoginOption.bdo();
		
		}
	
	
	public static void gpm() {
		Scanner sc=new Scanner(System.in);
		System.out.println(""
				+ "     1. Login to Grampanchayt please Enter your username and password. \n"
				+ "	    2. Register Employee.\n"
				+ "     3. See List of Employee working on that Project on Name.\n"
				+ "     4. Assign Employee to a Project.\n"
				+ "     5. View total number of days Employee worked in a project and also their wages.\n"
				+ "     6. Go back"
				          );    
		
		System.out.println();
		System.out.println("Chose appropriate option from above ");
		int gmpchoise=0;
		
		try {
			gmpchoise=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input! \n Please try again...");

			LoginOption.gpm();
		}
		
		switch(gmpchoise) {
		case 1:
			LoginGpm.LGpm();
			
			break;
		case 2:
			RegisterEmployee.REmployee();
		
			break;
	
		case 3:
			GetAllEmployee.GEMP();
			break;
		
		
		case 4:
			RegistarEmpToProject.emptoPro();
			break;
		
	    case 5:
	    	getEmpByPname.getEmplPname();
		break;
		
	    case 6:
			LoginOption.selectUser();;
			break;
	}
		
		LoginOption.gpm();
		
	}
	
	public static void selectUser() {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Choose Login options - \n" + "  1. BDO Login\n" + "  2. GPM Login\n");

		System.out.println("Enter above login option: ");

		int choice = 0 ;
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {

			System.out.println("Invalid input! \n Please try again...");

               LoginOption.selectUser();
		}

		switch (choice) {
		case 1:
			System.out.println("Enter BDO username");
			String username=sc.next();
			System.out.println("Enter BDO password");
			String password=sc.next();
			if(username.equals("bdo") && password.equals("bdo")) {
				System.out.println("BDO login successful");
				LoginOption.bdo();
			}else {
				System.out.println("Username or password is wrong..\n Please try again...");
				LoginOption.selectUser();
			}
			
			break;
			
		case 2:
			LoginOption.gpm();
			break;
		default:
			System.out.println("Invalid choice!...\n Please try again...");

		
			LoginOption.selectUser();
		}
	}

	
	
	
	
}


