class Student{
    private int rollNo;
    private String name;
    private double marks;
    private int attendance;

    public void setRollNo(int r){
        rollNo=r;
    }
    public void setName(String n){
        name=n;
    }
    public void setMarks(double m){
        marks=m;
    }
    public void setAttendance(int a){
        attendance=a;
    }

    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public double getMarks(){
        return marks;
    }
    public int getAttendance(){
        return attendance;
    }

    public String calculateResult(){
        if(marks>=40 && attendance>=75)
            return "Pass";
        else
            return "Fail";
    }

    public void display(){
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + getMarks());
        System.out.println("Attendance: " + getAttendance());
    }
}

public class Main
{
	public static void main(String[] args) {
		Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setRollNo(1);
        s1.setName("Ali");
        s1.setMarks(85);
        s1.setAttendance(80);

        s2.setRollNo(2);
        s2.setName("Ahmed");
        s2.setMarks(35);
        s2.setAttendance(90);

        s3.setRollNo(3);
        s3.setName("Sara");
        s3.setMarks(60);
        s3.setAttendance(70);

        s1.display();
        s2.display();
        s3.display();
	}
}
