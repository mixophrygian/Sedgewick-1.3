
	public class SortingThree {
			public static void main (String[] args){
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				int c = Integer.parseInt(args[2]);
				int t = 0;

				if(a > b) {t = a; a = b; b = t; }
				if(a > c) {t = a; a = c; c = t;}
				if(b > c) {t = b; b = c; c= t;}

				System.out.println("sorted order, beeches: " + a + " " + b + " " + c);
			}
	}