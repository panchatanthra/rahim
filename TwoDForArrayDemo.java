package hellopack;

public class TwoDForArrayDemo {
	public static void main(String[] args) {
		int[][] a=new int[3][4];//3 rows 4 columns
		
		a[0][0]=100;
		a[2][3]=444;
		
		System.out.println(a[0][0]);
		//a.length - no of columns
		//a[0].length - no of rows of the column
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
