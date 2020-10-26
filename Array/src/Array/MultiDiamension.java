package Array;

public class MultiDiamension {
public static void main(String[] args) {
	int ar[][]=new int[2][2];
	
	ar[0][0]=10;
	ar[0][1]=20;
	ar[1][0]=30;
	ar[1][1]=15;

	for (int i = 0; i <= ar.length-1; i++) {
		for (int j = 0; j <= ar.length-1; j++) {
			System.out.print(ar[i][j] + " ");
		}
		System.out.println();
	}
	
	
	int a[][]=new int[2][3];

	a[0][0]=10;
	a[0][1]=20;
	a[0][2]=50;
	a[1][0]=30;
	a[1][1]=15;
	a[1][2]=20;

	for (int i = 0; i <= a.length-1; i++) {
		for (int j = 0; j <= a.length-1; j++) {
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}
}
}
