public class Taxi {
		public static void main(String[] args) {
			int n = Integer.parseInt(args[0]);
			for(int count = 9; count <= n; count++){
				int twice = 0;
				for(int i = 1; i < count; i++){
					double firstHalf = Math.pow(i, 3);
					for(int j = i + 1; j < count; j++){
						double secondHalf = Math.pow(j, 3);
						if(firstHalf + secondHalf == count){
						twice++;
						if(twice == 2) System.out.println(count + " is the sum of two distinct sets of cubes");						
					
						}
					}
				}
					
			}
		}

	}
