package sctrach_Exception_pratice;

public class finallyKeyword {

	public static void main(String[] args) {
		int err=0;
		try {
			int a = 10/0;
			err=0;
		}
		catch(Exception e) {
			System.out.println(e);
			err=1;
		}
		finally {
			if(err==1) {
				System.out.println("Error found");
			}else {
				System.out.println("No Error");
			}
		}
	}

}
