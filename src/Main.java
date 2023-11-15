public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000; // рублей
        int term = 12; // месяц(ев)
        double percent = 9.99; // процента(ов)
        int payment = service.calculate(credit, term, percent);
        System.out.println(" Ежемесячный платёж = " + payment);

        credit = 1_000_000; // рублей
        term = 24; // месяц(ев)
        percent = 9.99; // процента(ов)
        payment = service.calculate(credit, term, percent);
        System.out.println(" Ежемесячный платёж = " + payment);

        credit = 1_000_000; // рублей
        term = 36; // месяц(ев)
        percent = 9.99; // процента(ов)
        payment = service.calculate(credit, term, percent);
        System.out.println(" Ежемесячный платёж = " + payment);

    }

}