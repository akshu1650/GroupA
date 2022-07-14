package Interface_Study;

public class My_class implements MyInterface {

	public static void main(String[] args) {
		
		My_class m=new My_class();
		m.test();
		m.test1();
		//a=a+10; a is final we cant upadte the value of a

	}

	@Override
	public void test() {
		
		System.out.println("test method is completed in implementation class");
		
	}

	@Override
	public void test1() {
		
		System.out.println("test1 method is completed in implementation class");
	}

}
