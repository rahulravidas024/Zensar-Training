package inheritance;

public class OnlineExam extends Exam{
	String userId;
	String password;
	int outOfMarks;
	
	OnlineExam() {
		userId = "rahulravidas024";
		password = "ABC";
		outOfMarks = 100;
	}
	OnlineExam(String id, String pass, int marks)
	{
		userId = id;
		password = pass;
		outOfMarks = marks;
	}
	public void takeOnlineExam()
	{
		int startTime = 10;
		int endTime = 12;
		System.out.println("Start Time: " + startTime);
		System.out.println("End Time: " + endTime);
	}
	public void result()
	{
		System.out.println("Marks: ");
		System.out.println("Percentage: ");
		
	}
	
}
