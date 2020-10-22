public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        this.balance -= 2.50;
    }

    public void payGourmet() {
        this.balance -= 4.00;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

}
