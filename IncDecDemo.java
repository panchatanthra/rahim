package hellopack;

public class IncDecDemo {
	public static void main(String[] args) {
		//increment - ++
		//decrement --
		int n=10;
		//System.out.println(n++);//n=n+1
		//n++ is post increment
		//++n is pre increment
		System.out.println(n++);//10-post increment
		//it prints first and then increments
		System.out.println(n);//11
		n=10;
		System.out.println(++n);//11- pre increment
		//it increments first and then prints
		System.out.println(n);//11
		n=10;
		System.out.println(n--);//10-post decrement
		//it prints first and then decrements
		System.out.println(n);//9
		n=10;
		System.out.println(--n);//9- pre decrement
		//it decrements first and then prints
		System.out.println(n);//9
	}
}
