package hellopack;

public class CastingDemo {
	public static void main(String[] args) {
		byte b=10;
		//1
		int i=b;//auto type promotion will happen
		b=(byte)i;//manual type casting-demotion
		//2
		int ii=258;
		byte bb=(byte)ii;
		//java will divide the number by the size
		//of the datatype
		System.out.println(bb);
		
		//3
		byte b1=2;
		byte b2=10;		
		byte result=(byte)(b1*b2);
		
		//4
		float f=1.3f;
		int num=(int)f;//both int and float are 32 bit
		f=num;//how ever reverse is acceptable
		
		//5
		int ich=97;
		char ch=97;
		ch='a';
		ch=(char)ich;//int is 32 bit and char is 16 bit
		
	}
}
