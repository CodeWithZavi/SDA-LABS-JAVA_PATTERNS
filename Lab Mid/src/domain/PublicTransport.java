package domain;

public class PublicTransport extends Transport {
    public PublicTransport() {
        super("Public Transport");
    }

    @Override
    public void schedule() {
        System.out.println(type + " It will scheduled flexible and with payment on the spot options");
    }
}
