package proone;

import java.util.Scanner;

public class Class14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a[][] = new int[5][2];
		int i, j;
		System.out.println("Give input");
		for (i = 0; i <= a.length - 1; i++) {

			for (j = 0; j <= a[i].length - 1; j++) {

				a[i][j] = scan.nextInt();
			}

		}

		System.out.println("Values are ");

		for (i = 0; i <= a.length - 1; i++) {

			for (j = 0; j <= a[i].length - 1; j++) {

				System.out.print(a[i][j]);
			}

			System.out.println("");
		}

	}

}
