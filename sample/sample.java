package sample;

import java.util.ArrayList;
import java.util.List;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a  = "a";
		String b = "b";
		String c =  "c";
		String d = "d";
		
		List l  = new ArrayList<String>();
		l.add(a);
		l.add(b);
		l.add(c);
		l.add(d);
		
		test t  = x->x.equals("a");
		printtt(t);
		
		

	}

	private static void printtt(test t) {
		if(t.printt("a")) {
			
		}
		
	}

	

}
