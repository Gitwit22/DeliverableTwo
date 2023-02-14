import java.util.Scanner;
public class DeliverableTwo {

	public static void main(String[] args) {

Scanner YesNo = new Scanner(System.in);


System.out.println("Welcome to the COINFLIP CHALLENGE");
		System.out.println("What is your name?");
		String name = YesNo.nextLine();
		
		System.out.println("Hello " + name + " do you want to do the COIN FLIP CHALLENGE? Yes/No");
		String yesno = YesNo.next();
				
		if (yesno.equals("no")){
			System.out.println("Oh! You must be a COWARD!!");
		} else if (yesno.equals("yes")){
			System.out.println("Ok lets play");
			
		}
		//start of game
		  int score = 0;
	        int totalTries = 5;
	        
	       
	        
	        for (int i = 1; i <= totalTries; i++) {
	            System.out.println("Guess heads or tails (try " + i + " of " + totalTries + "):");
	            String guess = YesNo.next();
	            
	            int coinFlip = (int) (Math.random() * 2); // 0 for heads, 1 for tails
	            
	            if (guess.equalsIgnoreCase("heads") && coinFlip == 0 || 
	                guess.equalsIgnoreCase("tails") && coinFlip == 1) {
	                System.out.println("Correct");
	                score++;
	            } else {
	                System.out.println("Wrong!");
	            }
	        }
	        //scoring
	        System.out.println("Thank you " + name + "! Your total score is " + score + " outta 5");
	        if (score <= 2) {
	        	System.out.println("You can do better");
	        } else {
	        	System.out.println("Pretty good job. Can you read Minds??");
	        }
	    }
		
	}


;