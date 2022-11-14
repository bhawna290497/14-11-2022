package com.bhawnajain.controller;

import java.util.Scanner;

import com.bhawnajain.service.StudentServiceImpl;

public class StudentController {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
	
		StudentServiceImpl ss=new StudentServiceImpl();
		System.out.println("Welcome to Student Portal");
		System.out.println("Press 1 for save student details ");
		System.out.println("Press 2 for get all student details ");
		System.out.println("Press 3 for update student details ");
		System.out.println("Press 4 for delete student details ");
		System.out.println("Press 5 for exit ");
		
		int c=scan.nextInt();
		
		switch (c) {
		case 1:
			ss.save();
			break;
			
		case 2:
			ss.show();
			break;
			
		case 3:
			ss.updateData();
			break;
		
		case 4:
			ss.deletebyId();
			break;

		case 5:
			break;
	}
		
	}
}
