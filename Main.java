package com.gradedproject.q1;
class SuperDepartment {
	public String departmentName() {
		return "Welcome to the Super Department";
	}
		public String getTodaysWork() {
		        return "No work as of now";
		        }
		public String getWorkDeadline() {
		        return "Nil";
		        }
		public String isTodayAHoliday() {
			return "Today is not a holiday";
			}
		}
class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to the Admin Department";
		}
	public String getTodaysWork() {
		return "Complete your documents submission";
		}
	public String getWorkDeadline() {
		return "Complete it by EOD";
		}
	}
class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to the HR Department";
		}
	public String getTodaysWork() {
		return "Fill out today's timesheet and mark your attendance";
		}
	public String getWorkDeadline() {
		return "Complete it by EOD";
		}
	public String doActivity() {
		return "Team lunch";
		}
	}
class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to the Tech Department";
		}
	public String getTodaysWork() {
		return "Complete coding of module 1";
		}
	public String getWorkDeadline() {
		return "Complete it by EOD";
		}
	public String getTechStackInformation() {
		return "Core java";
		}
	}
public class Main {
	public static void main(String[] args) {
		SuperDepartment superDepartment = new SuperDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();
        System.out.println(superDepartment.departmentName());
        System.out.println(superDepartment.getTodaysWork());
        System.out.println(superDepartment.getWorkDeadline());
        System.out.println(superDepartment.isTodayAHoliday());
        System.out.println();
        
        
        System.out.println(adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println();
        
        System.out.println(hrDepartment.departmentName());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.doActivity());
        System.out.println();
        
        System.out.println(techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
	}
}
        
        
        
        
		        

		        
