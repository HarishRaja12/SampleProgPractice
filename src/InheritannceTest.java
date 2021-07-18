class Parent {
	int a = 10;
	int b = 20;
	public void m1() {
	System.err.println(a + "," + b);
	}
}
class Child extends Parent {
	int a = 30;
	int b = 40;
	public void m1() {
		System.err.println(a + "," + b);
	}
}
public class InheritannceTest {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.m1();
		System.err.println(obj.a+","+obj.b);
	}
}
