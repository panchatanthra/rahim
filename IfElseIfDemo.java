package hellopack;

public class IfElseIfDemo {
	public static void main(String[] args) {
		int n1=11;
		int n2=10;
//		if(n1>10) {
//			if(n2<=10) {//NESTED IF
//				System.out.println("both condition satisfied");
//			}
//		}		
		if(n1>10 && n2<=10) {
			System.out.println("both c s");
		}		
		else {
			System.out.println("no condition satisfied..");
		}		
		//TERNARY OPERATOR- ?
		String result=(n1<n2)?"for true do this...":"for false do this";
		System.out.println(result);
		
		
	}
}
