package com.greatlearning.main;

import com.greatlearning.model.*;


public class Driver {
	private static AdminDepartment admDept;
	private static HrDepartment hrDept;
	private static TechDepartment tecDept;

	public static void main(String[] args) {

		admDept = new AdminDepartment();
		hrDept = new HrDepartment();
		tecDept = new TechDepartment();

		System.out.println(" Welcome to" + admDept.departmentName());
		System.out.println(admDept.getTodaysWork().trim());
		System.out.println(admDept.getWorkDeadline().trim());
		System.out.println(admDept.isTodayAHoliday().trim());
		System.out.println("\n");

		System.out.println(" Welcome to" + hrDept.departmentName());
		System.out.println(hrDept.doActivity().trim());
		System.out.println(hrDept.getTodaysWork().trim());
		System.out.println(hrDept.getWorkDeadline().trim());
		System.out.println(hrDept.isTodayAHoliday().trim());
		System.out.println("\n");

		System.out.println(" Welcome to" + tecDept.departmentName());
		System.out.println(tecDept.getTodaysWork().trim());
		System.out.println(tecDept.getWorkDeadline().trim());
		System.out.println(tecDept.getTechStackInformation().trim());
		System.out.println(tecDept.isTodayAHoliday().trim());
	}

}
