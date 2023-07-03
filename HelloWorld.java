package hellopack;
public class HelloWorld {
	//INSTANCE VARIABLES
	//instance variables are initialized by default
	//NUMBER TYPES
	byte b=-128; //8 BITS =-128 TO 127
	short s=32767;//16 BIT
	int i=-2147483648;//32 bit
	long lo=-922_33_7203_6854_77_5808L;
	
	//FLOATING TYPES
	float f=1.34f;//32 bit
	double d=2.233242223232D;//64 bit
	//CHARACTER 
	char c=97;//0 to 65535//16 bit 
	char cc='a';
	//BOOLEAN
	boolean classover=true;
	
	public void met() {
		//byte b=0;
		System.out.println(b);
	}
	public int getMarks() {
		return 10;
	}
	public static void main(String args[]) {
		HelloWorld obj=new HelloWorld();
		obj.met();
		System.out.println("Welcome to Java dhaanish");
	}
}
