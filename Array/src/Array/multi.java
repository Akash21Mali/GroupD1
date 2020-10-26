package Array;

public class multi {
public static void main(String[] args) {
	int a[][]= {{10,20,30},{20,10,30},{30,20,10}};///3 * 3 matrix we can use a.length
	for (int i = 0; i <= a.length-1; i++) {
		for (int j = 0; j <= a.length-1; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println(" ");
	}
	System.out.println(" ");
	int b[][]= {{10,20,30,40},{20,10,30,40}};///2 * 3 matrix we can't use a.length
	for (int i = 0; i <=1; i++) {
		for (int j = 0; j <=3; j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}

	
}
}
