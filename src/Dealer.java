public class Dealer extends Person {

    Dealer() {
        super();
        this.isPlaying = false;
        this.hasHidden = true;
    }

    @Override
    public void printTotal() {
        System.out.print("His");
        super.printTotal();
    }

    @Override
    public void hit() {
        System.out.print("Dealer ");
        super.hit();
    }

}
