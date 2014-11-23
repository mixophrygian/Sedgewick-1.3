public class FunctionGrowth {
		public static void main (String[] args) {
			for(double i = 16; i <= 2048; i *= 2) {
			System.out.print(Math.log(i));
			System.out.print('\t');
			System.out.print(i);
			System.out.print('\t');
			System.out.print(i * Math.log(i));
			System.out.print('\t');
			System.out.print(i * i);
			System.out.print('\t');
			System.out.print(i * i * i);
			System.out.print('\t');
			System.out.print(Math.pow(2, i));
			System.out.println();
			}
		}
}