package infrastructure;

public class SpotPayment implements PaymentProcessor {
    @Override
    public String process(String input) {
        return "Spot payment is proccessing " + input;
    }
}
