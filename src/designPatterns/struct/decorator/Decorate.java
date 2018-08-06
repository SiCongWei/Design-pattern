package designPatterns.struct.decorator;

public class Decorate implements Sourceable {

    private Sourceable source;

    public Decorate(Sourceable source){
        this.source=source;
    }

    @Override
    public void method() {
        System.out.println("before decorate....");
        source.method();
        System.out.println("after decorate....  ");
    }


}
