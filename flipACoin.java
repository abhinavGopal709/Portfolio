import java.util.*;
public class flipACoin {
	public void flipACoinGame() {
		Scanner console = new Scanner(System.in);
		Random randomGen = new Random();
		boolean isPlaying = true;
		boolean heads = false;
		boolean tails = false;
		String playAgain = "";
		while(isPlaying) {
			int outcome = randomGen.nextInt(2) + 1;
			System.out.println("What is your prediction heads or tails ?");
			console.next();
			String headsOrTails = console.nextLine();
			if(outcome == 1) {
				tails = true;
			}
			else if(outcome == 0) {
				heads = true;
			}
			if(headsOrTails.equals("heads") && heads == true) {
				System.out.println("Eh beginner's luck... you got it right it was heads...");
			}
			else if(headsOrTails.equals("tails") && heads == true) {
				System.out.println("Nice try! It was heads...");
			}
			else if(heads == true && headsOrTails.equals("heads") || tails == true && headsOrTails.equals("tails")) {
				System.out.println("Eh beginner's luck... you got it right it was tails...");
			}
			else{
				System.out.println("Nice try !");
				System.out.println("Would you like to try again ?");
				playAgain = console.next();
			}
			if(playAgain.contains("yes") || playAgain.contains("YES")) {
				isPlaying = true;
			}
			else {
				isPlaying = false;
				System.out.println("Thank you for playing Flip a Coin! Come play again soon !!");
				console.close();
			}
		}
	}
}
