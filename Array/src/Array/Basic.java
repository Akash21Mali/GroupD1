package Array;

import java.util.Arrays;
public class Basic {
public static void main(String[] args) {
	int ar[]= new int[5];
	ar[0]=50;
	ar[1]=150;
	ar[2]=20;
	ar[3]=15;
	ar[4]=500;
   //simple output
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
	System.out.println();
	System.out.println("ascending");
	Arrays.sort(ar);
   // Ascending order
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
		
     //decending order
	System.out.println();
	System.out.println(" descending order");
		for (int i =4; i>=0; i--) {
			System.out.println(ar[i]);
		}
}
}
