package hellopack;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		int i=10;
		switch(i) {//only value can be given
		default:{
			System.out.println("no condition satisfied..");
			break;
		}
		case 10:{
			System.out.println("CLASS RESUMES @ 1:20 pm");
			break;
		}
		case 100:{
			System.out.println("100 100 100");
			break;
		}
		case 200:{
			System.out.println("2000000000");
		}
		}
	}
}
