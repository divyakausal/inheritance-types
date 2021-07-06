package com.app.hasArelationship;

public class Test {
	public static void main(String[] args)
	{
		College college = new College();
		college.setCid(101);
		college.setCName("PRMIT&R");
		
		Student student = new Student();
		student.setSid(21);
		student.setSName("Divya");
		
		Student student1 = new Student();
		student1.setSid(42);
		student1.setSName("Mayur");
		
		Student[] students=new Student[2];
		students[0]=student;
		students[1]=student1;
		
		college.setStudents(students);
		
		System.out.println(college.getCid()+"\t"+college.getCName());
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].getSid()+"\t"+students[i].getSName());
			
		}
	}

}
