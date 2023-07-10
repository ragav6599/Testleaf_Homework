package week3.day1;

public class Students {
	
	
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	
	public void getStudentInfo(String name) {
		System.out.println(name);
	}
	
	public void getStudentInfo(String Mail, long num) {
		System.out.printf(Mail + num);

	}	
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(15);
		info.getStudentInfo("RAgavan");
		info.getStudentInfo("ragavan@gmail.com", 9487482338l);
		
	}

}
