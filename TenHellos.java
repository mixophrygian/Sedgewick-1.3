public class TenHellos {
		public static void main (String[] args) {
		//accepts user entry for number of lines
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i <= num; i++){
			if(i % 10 == 1 && i != 11) {
				System.out.println(i + "st Hello!");	
			} else if(i % 10 == 2 && i != 12) {
				System.out.println(i + "nd Hello!");
			}else if(i % 10 == 3 && i != 13){
 				System.out.println(i + "rd Hello!");
			} else {
				System.out.println(i + "th Hello!");	
				}
			}

		}
	}