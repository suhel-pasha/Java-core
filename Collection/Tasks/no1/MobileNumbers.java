package collection.tasks.no1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumbers {

	public static void main(String[] args) {
		
		Collection mobileNumbers = new ArrayList();
		
		mobileNumbers.add(9986447145l);
		mobileNumbers.add(9651865221l);
		mobileNumbers.add(6282117319l);
		mobileNumbers.add(7837901022l);
		mobileNumbers.add(7837411804l);
		mobileNumbers.add(9686114876l);
		mobileNumbers.add(8041896753l);
		mobileNumbers.add(6178250966l);
		mobileNumbers.add(7924497000l);
		mobileNumbers.add(9720811594l);
		
		Iterator iterator = mobileNumbers.iterator();
		
		System.out.println("The Mobile Numbers with thier last digits greater than 3 are :");
		
		while(iterator.hasNext()) {
			long a = (long) iterator.next();
			
				if(a%10>3) {
					System.out.println(a);
				}
			
		}

	}

}
