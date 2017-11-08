public class Dealer extends Person {

    Dealer() {
        super();
        this.isPlaying = false;
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
