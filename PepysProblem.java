public class PepysProblem {
			public static void main(String[] args) {
			
			int oneOne = 0;
			int twoOnes = 0;
			double diceRoll = 0;
			int lowerRoll = 0;
			int higherRoll = 0;
			int trials = Integer.parseInt(args[0]);
			for(int j = 0; j < trials; j++){
				for(int i = 0; i < 6; i++){
				diceRoll = Math.round(10 * Math.random() * 0.6);
				if(diceRoll == 1) oneOne++;
			}
			if(oneOne > 0) {
				lowerRoll++;
			} 
			oneOne = 0;
			for(int i = 0; i< 12; i++){
				diceRoll = Math.round(10 * Math.random() * 0.6);
				if(diceRoll == 1) oneOne++;
				if(oneOne == 2) {
					higherRoll++;
					break;
				}
			}
			}
			if(lowerRoll > higherRoll) {
				System.out.println("Out of " +trials+" trials, it's more likely to get a single 1 from six single dice roll than two 1s from twelve rolls.");
			}
			else if(higherRoll > lowerRoll) {
				System.out.println("Out of " +trials+" trials, it's more likely to get two 1s from twelve single dice roll than a single 1 from six rolls.");
			}else {
				System.out.println("Out of " +trials+" trials, both scenarios are equally likely!");
			}
			}
}