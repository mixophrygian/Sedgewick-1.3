public class PrimeCounter {
		public static void main (String[] args) {
			int num = Integer.parseInt(args[0]);
			printPrimes(num);
			}

		private static void printPrimes(int num) {
		for(int i = 1; i <= num; i++){
			if(isPrime(i)) System.out.println(i);
			}

		}
	

		static boolean isPrime(int check) {
		//This answer arrived at with help from Mkyoung.com//
		if(check % 2 == 0) return false;
		for(int i = 3; i*i< check; i+= 2){
			if(check % i == 0) return false;
				}
		return true;
		}


}