package mypack;

public class DemoBean implements Demo 
{
	private String userName;
	private Integer userSal;
	
	public DemoBean(String userName, Integer userSal)
	{
		this.userName = userName;
		this.userSal = userSal;
	}
	
	public void showData()
	{
		System.out.println("Welcome: "+userName);
		System.out.println("Salary: "+userSal);
	}
}
