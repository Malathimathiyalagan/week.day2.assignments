package week.day2.assignments;
//multiple inheritance
public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id);
		System.out.println(name);
	
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println(email);
		System.out.println(phoneNumber);
	
	}

	public static void main(String[] args) {
	Students  obj =new Students();
	obj.getStudentInfo(006);
	obj.getStudentInfo(006, "Malathi");
	obj.getStudentInfo("malathi@gmail.com", 9876765654l);

	}

}
