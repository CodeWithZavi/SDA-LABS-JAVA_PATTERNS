package infrastructure;

public class WaitingProcessor implements PaymentProcessor {
    @Override
    public String process(String input) {
        return "Wait for payment proccesing " + input;
    }
}
