package infrastructure;

public class AdvancePayment implements PaymentProcessor {
    @Override
    public String process(String input) {
        return "advaned payment is processing " + input;
    }
}
