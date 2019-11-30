package protwo;

import java.util.ArrayList;

public class ArrayListConcepts {

	public  static  <E> void  main(String[] args) {

		//ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ArrayList ar1 = new ArrayList();
		ArrayList<E> ar2 = new ArrayList<E>();
		
		//ArrayList<Boolean> ar2 = new ArrayList();
		
		ar1.add(1);
		
		ar1.add(2);
		ar1.add(3);
		ar1.add(3);
		System.out.println(ar1.size());
		
		ar1.add(5);
		ar1.add(6);
		ar1.add(7);
		ar1.add(8);
		System.out.println(ar1.size());
		System.out.println(ar1);
		
		System.out.println(ar1.get(0));
		System.out.println(ar1.get(2));
		System.out.println(ar1.get(3));
		System.out.println(ar1.get(4));
		
		for(int i=0;i<=ar1.size()-1;i++) {
			System.out.println(ar1.get(i));
			
		}

	}

}
