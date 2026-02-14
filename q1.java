class Student{
    private int rollNo;
    private String name;
    private double marks;

    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public double getMarks(){
        return marks;
    }

    public void setRollNo(int roll){
        rollNo=roll;
    }
    public void setName(String Name){
        name=Name;
    }
    public void setMarks(double mark){
        marks=mark;
    }

    public String calculateGrade(){
        if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }
    
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade() + "\n");
    } 
}

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setRollNo(1);
        s1.setName("Ali");
        s1.setMarks(85);

        s2.setRollNo(2);
        s2.setName("Bilal");
        s2.setMarks(72);

        s3.setRollNo(3);
        s3.setName("Ahmed");
        s3.setMarks(48);

        s1.display();
        s2.display();
        s3.display();
    }
}
