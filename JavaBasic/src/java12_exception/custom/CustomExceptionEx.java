package java12_exception.custom;

public class CustomExceptionEx {
	public static void main(String[] args) {
		
		User user = new User();
		
		try {
			user.setAge(14);
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
		
		try {
			user.setAge(-45);
		} catch (UserAgeException e) {
			e.printStackTrace();
		}
		
	}
}
