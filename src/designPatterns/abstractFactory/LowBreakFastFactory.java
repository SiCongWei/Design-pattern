package designPatterns.abstractFactory;

public class LowBreakFastFactory implements BreakfastFactory {

    @Override
    public BreakFast sellBuns() {
        return new CheapBuns();
    }

    @Override
    public BreakFast sellSoyMilk() {
        return new CheapSoyMilk();
    }


}
