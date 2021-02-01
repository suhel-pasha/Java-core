package sample2;

public class stringgg {

	public static void main(String[] args) {
		
		String s = "abc";
		String t = "59";
		
		
		if(((int)s.charAt(0)<58 && (int)s.charAt(0)>47)) {
			
			System.out.println("The inputs are number");
			int a=0;
			int b=0;
			int sum=0;
			int x=1;
			int y=1;
			for (int i = s.length()-1; i >= 0; i--) {
				a=a+(((int)s.charAt(i)-48)*x);
				x=x*10;
			}
			for (int i = t.length()-1; i >= 0; i--) {
				b=b+((int)t.charAt(i)-48)*y;
				y=y*10;
			}
			sum=a+b;
			System.out.println(sum);
		}
		else {
			System.out.println(s+t);
		}

	}

}
