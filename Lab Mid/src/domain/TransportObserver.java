package domain;

public class TransportObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer is updated to : " + message);
    }
}
