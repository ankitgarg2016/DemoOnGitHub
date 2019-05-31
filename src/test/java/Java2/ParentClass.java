package Java2;

public class ParentClass {

	public int a = 10;

	public void display() {
		System.out.println("I am in display");
	}

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void sum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

}
