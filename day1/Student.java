package week1.day1;

public class Student {

	String studentName="Harish";
	int rollNo=8698705;
	String collegeName="Bharathiar University";
	int markScored=483;
	float cgpa=9.16f;
	
	public static void main(String[] args) {
		Student obj =new Student();
		System.out.println(obj.studentName);
		System.out.println(obj.rollNo);
		System.out.println(obj.collegeName);
		System.out.println(obj.markScored);
		System.out.println(obj.cgpa);
	}
}
