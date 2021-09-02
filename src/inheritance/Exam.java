package inheritance;

public class Exam {
	private String examName;
	String universityName;
	Exam()
	{
		examName = "Java";
		universityName = "RTMNU";
	}
	Exam(String a, String b)
	{
		examName = a;
		universityName = b;
	}
	protected void display()
	{
		System.out.println("Exam Name: " + examName);
		System.out.println("Exam Name: " + universityName);
		
	}
}
