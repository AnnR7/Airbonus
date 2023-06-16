
public class Main {

    public static void main(String[] args) {

        int ticket = 25_164; // стоимость билета
        int bonus = 20; // рублей за 1 милю
        int mile = ticket / bonus; // бонусные мили
        System.out.println((mile) + "  Начислено Бонусных миль");
    }
}