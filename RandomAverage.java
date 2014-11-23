public class RandomAverage {
		public static void main (String[] args) {
			int n = Integer.parseInt(args[0]);
			double randomSum = 0;	
			double randomNum = 0;
			for(int i = 0; i < n; i++) {
				randomNum = Math.random();
				System.out.println(randomNum);
				randomSum += randomNum;
			}
			double average = randomSum / n;
			System.out.println("The average random number was: " + average);

		}
}