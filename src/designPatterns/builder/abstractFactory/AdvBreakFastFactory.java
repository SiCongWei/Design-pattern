package designPatterns.builder.abstractFactory;

public class AdvBreakFastFactory implements BreakfastFactory{
    @Override
    public BreakFast sellBuns() {
        return new ExpensiveBuns();
    }

    @Override
    public BreakFast sellSoyMilk() {
//        Collection c = new ArrayList();
//        c.iterator();
        return new ExpensiveSoyMilk();
    }
}
