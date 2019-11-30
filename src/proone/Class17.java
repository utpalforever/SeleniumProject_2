package proone;

import java.util.Scanner;

public class Class17 {

	public static void main(String[] args) {

		String str1 = "JohnGoogle";
		String str2 = new String("JohnFacebok");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.charAt(2));
		// System.out.println(str1[2]);

		System.out.println("----------");
		System.out.println("----------");

		String str3 = new String("CopyString");
		String str4 = str3.intern();
		System.out.println(str4);

		String str5 = "CopyString";
		String str6 = str5.intern();

		System.out.println(str6);

		if (str5 == str6)
			System.out.println("Equal;");

		System.out.println(str5.substring(1));
		System.out.println(str5.substring(1, 7));
		System.out.println(str5.endsWith("ig"));
		System.out.println(str5.startsWith("copy"));
		System.out.println(str5.startsWith("Copy"));
		System.out.println(str5 + str6);
		char c1 = '1';
		char c2 = '1';
		System.out.println(c1 + c2);
		String str7 = "2";
		String str8 = "3";
		System.out.println(str7 + str8);
		System.out.println(str7.concat(str8));

		StringBuffer str9 = new StringBuffer("John");

		StringBuilder str10 = new StringBuilder("Cena");

		System.out.println(str9.append(str10));

		Scanner scan = new Scanner(System.in);
		StringBuffer s11 = new StringBuffer();

//s11=scan.nextLine();   //nextLine() can not be used with the StringBuffer or StringBuilder

		String s12;

		s12 = scan.nextLine();
		System.out.println(s12);

	}

}
