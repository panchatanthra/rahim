package hellopack;

public class RelationalDemo {
	public static void main(String[] args) {
		int n1=10;
		int n2=2;
		
		//Remember the result of a relational operator
		//is always a boolean (true or false)
		
		boolean b=n1>n2;
		System.out.println(b);//true
		
		b=n1==n2;//comparison
		System.out.println(b);//false
		
		b=n1!=n2;//not equal to
		System.out.println(b);//true
		
		//Logical operators - AND / Or / NOT
		b=(n1<n2)||(n1!=10);//either or 
		System.out.println(b);
		
		b=(n1>n2)&&(n1==10);//AND 
		System.out.println(b);
		
	}
}
