
public class A {

	public static void main(String[] args) {

		System.out.println("Hi, i'm A.");
		System.out.println("change A in master.");
		B btest=new B();
		btest.sayB();
		System.out.println("merge devB and master.");

		System.out.println("Hi, i'm A.");
		C ctest=new C();
		ctest.sayC();
		System.out.println("merge devC and master.");
	}

}
