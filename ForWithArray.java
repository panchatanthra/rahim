package hellopack;

public class ForWithArray {
	public static void main(String[] args) {
//		int[] a=new int[5];//5 column array
//		a[0]=999;//post initialization
//		a[1]=998;
//		a[2]=876;
//		a[3]=765;
//		a[4]=465;
		int[] a= {10,30,66,78,99};//pre initialization
		
		System.out.println(a[1]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//enhanced for loops - introduced in jdk5
		for(int i:a) {
			System.out.println(i);
		}
	}
}
