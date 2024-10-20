package package_1;

import package_2.school;

//Access Modifier
class Teacher{  // access within block.
	private String t_name = "Kumar";

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
}
class Teacher1 extends school{  // can access anywhere
	private String t_name = "Kumar";
}
public class student {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		System.out.println(t.getT_name());
		Teacher2 t2 = new Teacher2();
		System.out.println(t2.salary);
		
		
		
		// protected can access using same package.
		//public can access anywhere in any packages,or class
		// private can access within the block only.
		//default can access within the package only.cannot access in another package
	}

}
