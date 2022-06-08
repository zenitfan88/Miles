public class Main {
    public static void main(String[] args) {
        int pricePerTicket = 2135;
        int priceForBonus = 20;
        int bonusMiles = pricePerTicket / priceForBonus;
        System.out.println("Количество бонусных миль - " + bonusMiles);
    }
}
