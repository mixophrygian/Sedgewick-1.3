//MedianFive.java
public class MedianFive {
			public static void main(String[] args){
				int numOne = Integer.parseInt(args[0]);
				int numTwo = Integer.parseInt(args[1]);
				int numThree = Integer.parseInt(args[2]);
				int numFour = Integer.parseInt(args[3]);
				int numFive = Integer.parseInt(args[4]);

				double average = (numOne + numTwo + numThree + numFour + numFive) / 5;

				double resultOne = Math.abs(average - numOne);
				double resultTwo = Math.abs(average - numTwo);
				double resultThree = Math.abs(average - numThree);
				double resultFour = Math.abs(average - numFour);
				double resultFive = Math.abs(average - numFive);

				double temp = Math.min(resultOne, resultTwo);
				temp = Math.min(temp, resultThree);
				temp = Math.min(temp, resultFour);
				temp = Math.min(temp, resultFive);

				if(temp == resultOne){
						System.out.println("The median is " +numOne);
						}
				if(temp == resultTwo){ 
						System.out.println("The median is " +numTwo);
						}
				if(temp == resultThree){
						System.out.println("The median is " +numThree);
						}
				if(temp == resultFour) {
						 System.out.println("The median is " +numFour);
						 }
				if(temp == resultFive) {
						System.out.println("The median is " +numFive);
					}
			
			}
		
}

