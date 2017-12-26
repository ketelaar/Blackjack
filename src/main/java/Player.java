public class Player extends Person {

    Player() {
        super();
        this.playing = true;
    }

    @Override
    public void printTotal() {
        System.out.print("Your ");
        super.printTotal();
    }

    @Override
    public void hit() {
        System.out.print("You ");
        super.hit();
    }
}
