package designPatterns.abstractFactory;

public class AdvBreakFastFactory implements BreakfastFactory{
    @Override
    public BreakFast sellBuns() {
        return new ExpensiveBuns();
    }

    @Override
    public BreakFast sellSoyMilk() {
        return new ExpensiveSoyMilk();
    }
}
