package domain;

public abstract class Transport {
    protected String type;

    public Transport(String type) {
        this.type = type;
    }

    public abstract void schedule();
}
