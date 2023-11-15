public class CreditPaymentService {
    public int calculate(int credit, int term, double percent) {
        double conversion;
        conversion = percent / 100 / 12;
        double coefficient;
        coefficient = (conversion * Math.pow((1 + conversion), term)) / (Math.pow((1 + conversion), term) - 1);
        double result = credit * coefficient;
        return (int) result;
    }
}
