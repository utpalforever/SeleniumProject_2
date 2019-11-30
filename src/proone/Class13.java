package proone;

import java.util.Scanner;

public class Class13 {

	public static void main(String[] args) {
// Using for loop
		int a[] = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Give Input");
		int i=0;
		for ( i=0;i <= a.length - 1; i++) {

			a[i] = scan.nextInt();
		}

		System.out.println("Values are");

		for (  i = 0; i <= a.length - 1; i++) {

			System.out.println(a[i]);

		}
		//Using do-while loop

		int b[] = new int[3];
		int j = 0;
		System.out.println("Give Input through \"do-while\" loop");
		do {
			b[j] = scan.nextInt();
			j++;
		} while (j <= b.length - 1);
		System.out.println("Values are");
		j=0;
		do {
			System.out.println(b[j]);
			j++;
		} while (j <= b.length - 1);
		
		//Using while loop
		
		int c[] = new int[3];
		System.out.println("Give Input through while loop");
		int k=0;
		while(k<=c.length-1){
			c[k]=scan.nextInt();
			k++;
			
		}
		
		System.out.println("Values are");
		
		
		
		
		int l=0;
		while(l<=c.length-1){
			System.out.println(c[l]);
			l++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
