public class DealGame {
			public static void main(String[] args){
				//tests whether or not it's advantagous to switch doors in "Let's make a deal!"  Unlike the real game, this simulation allows for the possibility that the opened door could have been the door with the big prize.
				int N = Integer.parseInt(args[0]);
				//number of the game should be simulated to test each strategy (switch or don't switch)
				double dontSwitch = 0;
				double doSwitch = 0;
				double newChoice = 0;
	
				for(int i = 0; i < N; i++){
					double chosenDoor = (int)(Math.random() * 2);
					double prizeDoor = (int)(Math.random() * 2);

					if(chosenDoor == prizeDoor) {
						dontSwitch++;
						}

					newChoice = Math.round(Math.random() * 2);
					while(newChoice == chosenDoor){ 
						newChoice = (int)(Math.random() * 2);
						}
					if(newChoice == prizeDoor) doSwitch++;	
						
				}
					
					
				double successSwitch = Math.round((doSwitch / N) * 100);
				double successStay = Math.round((dontSwitch / N) * 100);
			
				System.out.println("Out of " +N+" trials, your chances of success if you switch are: " +(int)successSwitch+ "% " + "versus " +(int)successStay+ "% chances of success for not switching.");
}
}