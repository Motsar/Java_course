public class Main {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(150);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
    }
}
