import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
        // Create a Student object with attributes
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
				String rollno = input.nextLine();
		int marks = input.nextInt();

       Student student = new Student (name,rollno,marks);

        // Display MobilePhone details
        student.display();
		
    }
}

class Student {
    private String name;
    private String rollno;
    private int marks;

    // Constructor
    public Student(String name,String rollno,int marks) {
        this.name=name;
		        this.rollno=rollno;
        this.marks=marks;

    }
	public String CalculateGrade(){
	    if(this.marks > 90){
		return "A";
	}
	  else if(this.marks > 75){
		return "B";
	}
	  else if(this.marks > 50){
		return "C";
	}
	  else if(this.marks > 30){
		return "D";
	}
		else{
		return "Fail";
	}
}
  

    // Method to display the details
    public void display() {
        System.out.println("Student name  : " + this.name);
           System.out.println("Rollno of student : " + this.rollno);
        System.out.println("marks of student  : " + this.marks);
        System.out.println("Grades of student  : " + this.CalculateGrade());

   }
     
	   
	   
	   
	   

   
}
