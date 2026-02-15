class Member{
    private int memberID;
    private String name;
    private double initialWeight;
    private double currentWeight;
    private int workoutHours;

    public void setMemberID(int id){
        memberID=id;
    }
    public void setName(String n){
        name=n;
    }
    public void setInitialWeight(double iw){
        initialWeight=iw;
    }
    public void setCurrentWeight(double cw){
        currentWeight=cw;
    }
    public void setWorkoutHours(int wh){
        workoutHours=wh;
    }

    public int getMemberID(){
        return memberID;
    }
    public String getName(){
        return name;
    }
    public double getInitialWeight(){
        return initialWeight;
    }
    public double getCurrentWeight(){
        return currentWeight;
    }
    public int getWorkoutHours(){
        return workoutHours;
    }

    public String assessProgress(){
        if(workoutHours>=10 && currentWeight<initialWeight)
            return "Good Progress";
        else
            return "Needs Improvement";
    }

    public void display(){
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
        System.out.println("Initial weight: " + initialWeight);
        System.out.println("Current weight: " + currentWeight);
        System.out.println("Workout Hours: " + workoutHours + "\n");
        System.out.println("Assessment: " + assessProgress());
    }
}

public class Main
{
	public static void main(String[] args) {
		Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();

        m1.setMemberID(1);
        m1.setName("Ali");
        m1.setInitialWeight(80);
        m1.setCurrentWeight(75);
        m1.setWorkoutHours(12);

        m2.setMemberID(2);
        m2.setName("Ahmed");
        m2.setInitialWeight(90);
        m2.setCurrentWeight(92);
        m2.setWorkoutHours(15);

        m3.setMemberID(3);
        m3.setName("Sara");
        m3.setInitialWeight(65);
        m3.setCurrentWeight(63);
        m3.setWorkoutHours(8);

        m1.display();
        m2.display();
        m3.display();
	}
}
