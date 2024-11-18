package domain;

public class UniversityTSP extends Transport {
    public UniversityTSP() {
        super("University TSP");
    }

    @Override
    public void schedule() {
        System.out.println(type + " It will scheduled with advanced payment and time restrictions ");
    }
}
