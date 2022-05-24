package com.vstl.inheritance;

public class ExamMarks extends Studentname {

	int inttheory=100;
	int intpractical=50;
	int inttotal=inttheory+intpractical;
	
	public void theory() {
		System.out.println("theory marks:"+inttheory);
	}
	public void practical() {
		System.out.println("Practical:"+ intpractical);
	}
	public void total() {
		System.out.println("total:"+inttotal);
	}
	
	
	public void getDetailsExam() {
		this.StudentName();
		this.RollNo();
		this.theory();
		this.practical();
	}
}

