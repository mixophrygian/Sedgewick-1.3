public class CheckSum {
		public static void main (String[] args){
			int partialISBN = Integer.parseInt(args[0]);
			int workingISBN = partialISBN;
			int sum = 0;
			for(int i = 2; i < 11; i++){
			int last = workingISBN % 10;
			sum += i*last;
			workingISBN /= 10;
			}
			for(int j = 0; j <= 10; j++){
			if((sum + j) % 11 == 0){
				if(j == 10) {
				System.out.println(args[0] + "X");
				} else {
				System.out.println(args[0] + j);		
				break;
				}
				}
			}

		}
}