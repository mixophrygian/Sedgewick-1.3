public class DealGame {
			public static void main(String[] args){
				//tests whether or not it's advantage to switch doors in "Let's make a deal!""
				int N = Integer.parseInt(args[0]);
				//number of the game should be simulated to test each strategy (switch or don't switch)
				double dontSwitch = 0;
				double doSwitch = 0;
				double newChoice = 0;
				for(int i = 0; i < N; i++){
					double chosenDoor = Math.round(Math.random() * 10 * 0.3);
					if(chosenDoor == 0) chosenDoor = 1;
					double prizeDoor = Math.round(Math.random() * 10 * 0.3);
					if(prizeDoor == 0) prizeDoor = 1;
					if(chosenDoor == prizeDoor) {
						dontSwitch++;
						}
					newChoice = Math.round(Math.random() * 10 * 0.3);
					if(newChoice == 0) newChoice = 1;
					while(newChoice == chosenDoor){ 
						newChoice = Math.round(Math.random() * 10 * 0.3);
						if(newChoice == 0) newChoice = 1;
				}
					if(newChoice == prizeDoor) doSwitch++;

				}
				double successSwitch = Math.round((doSwitch / N) * 100);
				double successStay = Math.round((dontSwitch / N) * 100);

				System.out.println("Out of " +N+" trials, your chances of success if you switch are: " +(int)successSwitch+ "% " + "versus " +(int)successStay+ "% chances of success for not switching.");
}
}