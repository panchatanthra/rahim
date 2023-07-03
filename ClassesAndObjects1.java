package hellopack;

import java.util.Scanner;

public class ClassesAndObjects1 {
	public static void main(String[] args) {
		try {
			while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a class name..:");
		String classname=scan.next();
		LivingObject obj=(LivingObject)
				Class.forName(classname)
				.getConstructor().newInstance();
		System.out.println(obj);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class LivingObject{
	
}
class Animal extends LivingObject{
	public Animal() {
		// TODO Auto-generated constructor stub
	}
}
class Human1 extends LivingObject{
	public Human1() {
		// TODO Auto-generated constructor stub
	}
}
