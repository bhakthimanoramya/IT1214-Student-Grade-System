import java.util.Scanner;
import java.util.ArrayList;


//student class
class Student{
	private int studentID;
	private String studentName;
	private double marks;
	
	Student(int studentID,String studentName,double marks){
		
	this.studentID=studentID;
	this.studentName=studentName;
	this.marks=marks;	
	}
	
	
	public int getStudentID(){
		return studentID;
	}
	public String getStudentName(){
		return studentName;
	}
	public double getMarks(){
		return marks;
	}
	
	
	public void setStudentID(int studentID){
		this.studentID=studentID;
	}
	public void setStudentName(String studentName){
		this.studentName=studentName;
	}
	public void setMarks(double marks){
		this.marks=marks;
	}
}