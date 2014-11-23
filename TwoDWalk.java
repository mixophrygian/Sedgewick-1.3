public class TwoDWalk {
				public static void main (String[] args){
					//given a grid of size 2N * 2N, determines how many random steps a walker, initially centered in the grid, would need to take before hitting a boundary.//
				int N = Integer.parseInt(args[0]);
				int x = N;
				int y = N;
				int totalMoves = 0;
				while((x != 0 && x!= 2*N) && (y != 0 && y!= 2*N)){
					double move = Math.random();
					if(move < 0.25){
					y -= 1;
					totalMoves++;
					}
					if(move >= 0.25 && move < 0.5){
					y += 1;
					totalMoves++;
					}
					if(move >= 0.5 && move < 0.75) {
					x += 1;
					totalMoves++;
					}
					if(move >= 0.75){
					x -= 1;
					totalMoves++;
					}
				}
				System.out.println("After " +totalMoves +" moves, the random walker hit a boundary.");
				}
}