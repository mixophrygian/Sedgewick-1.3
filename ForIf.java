public class ForIf {
		public static void main (String[] args) {
			for(int i = 1000; i <  2001; i++) {
			System.out.print(i + " ");
			if(i % 10 == 4 || i % 10 == 9) System.out.print('\n');
				
			}
		}
}