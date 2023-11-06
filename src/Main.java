public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили
        int ticketPrice;
        int rublsForMile;

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        ticketPrice = 13_676;
        rublsForMile = 20;

        int bonusMiles = ticketPrice / rublsForMile;

        System.out.println("Будет начислено бонусов: " + bonusMiles);
    }

}
