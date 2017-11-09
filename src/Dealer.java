public class Dealer extends Person {

    Dealer() {
        super();
        this.playing = false;
    }

    @Override
    public void printTotal() {
        System.out.print("His ");
        super.printTotal();
    }

    @Override
    public void hit() {
        System.out.print("Dealer ");
        super.hit();
    }

}
