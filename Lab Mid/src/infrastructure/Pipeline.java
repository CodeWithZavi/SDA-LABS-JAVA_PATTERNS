package infrastructure;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    private List<PaymentProcessor> processors = new ArrayList<>();

    public void addProcessor(PaymentProcessor processor) {
        processors.add(processor);
    }

    public String execute(String input) {
        String result = input;
        for (PaymentProcessor processor : processors) {
            result = processor.process(result);
        }
        return result;
    }
}
