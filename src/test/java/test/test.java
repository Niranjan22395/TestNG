package test;

public class test {
	
	static {
		m1();
		System.out.println("first static block");
	}
	public static void m1() {
		System.out.println(j);
	}
	static {
		System.out.println("second staic bloc");
	}
	
	
   public static void main(String...a) {
	   m1();
    System.out.println("main method");
	   
}
   static int j =11;
}
