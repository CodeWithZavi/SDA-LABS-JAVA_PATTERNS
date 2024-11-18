package domain;

public class OwnConveyance extends Transport {
    public OwnConveyance() {
        super("Own Conveyance ");
    }

    @Override
    public void schedule() {
        System.out.println(type + " It wil shedule with flexible sheduling");
    }
}
