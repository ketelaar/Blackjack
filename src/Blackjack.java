import java.util.Scanner;

public class Blackjack {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        (new Blackjack()).run();
    }

    private void newLine() {
        System.out.println("");
    }

    private void run() {

        Person dealer = new Dealer();
        Person player = new Player();

        Card firstCard = player.getHand().get(0);
        Card secondCard = player.getHand().get(1);
        System.out.println("You get a " + firstCard.getValue() + " and a " + secondCard.getValue());
        player.printTotal();
        newLine();

        firstCard = dealer.getHand().get(0);
        secondCard = dealer.getHand().get(1);

        System.out.println("The dealer has a " + firstCard.getValue() + " showing, and a hidden card.");
        System.out.println("His total is hidden, too.");
        newLine();

        // Player's turn to play
        while (player.isPlaying()) {
            System.out.println("Would you like to \"hit\" or \"stay\"?");
            String nextAction = sc.next();
            nextAction = nextAction.toLowerCase(); // capitalization is made trivial for input
            switch (nextAction) {
                case "hit":
                    player.hit();
                    player.printTotal();
                    if (player.getTotal() > 21) {
                        System.out.println("You went bust");
                        newLine();
                        System.out.println("YOU LOSE!");
                        return;
                    }
                    break;
                case "stay":
                    player.stay();
                    break;
                default:
                    System.out.println("Illegal move, try again");
                    break;
            }
        }

        // Dealer's turn to play
        dealer.setPlaying();
        System.out.println("Okay, dealer's turn.");
        System.out.println("His hidden card was a " + secondCard.getValue());
        System.out.println("His total was " + dealer.getTotal());
        newLine();

        while (dealer.isPlaying()) {
            if (dealer.getTotal() < 17) {
                System.out.println("Dealer chooses to hit");
                dealer.hit();
                dealer.printTotal();
                newLine();
                if(dealer.getTotal() > 21) {
                    System.out.println("Dealer went bust");
                    newLine();
                    System.out.println("YOU WIN!");
                    return;
                }
            } else {
                dealer.stay();
                System.out.println("Dealer stays.");
                newLine();
            }
        }

        // Summary of both the player's total and the dealer's
        System.out.println("Dealer total is " + dealer.getTotal());
        System.out.println("Your total is " + player.getTotal());
        newLine();

        if (player.getTotal() > dealer.getTotal()) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU LOSE!");
        }
    }
}
