
public class Sample2 {

	public static void m1(Employee e1) {
    e1.id=2;e1.name="Raja";
	}

	public static void main(String args[]) {
		Employee e1=new Employee();
		e1.id=1;
		e1.name="Hari";
		m1(e1);
		System.err.println(e1);
	}
}
