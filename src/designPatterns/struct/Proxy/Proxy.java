package designPatterns.struct.Proxy;

public class Proxy implements Sourceable{

    private Sourceable source;

    public Proxy(){
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    public void before(){
        System.out.println("before()......");
    }

    public void after(){
        System.out.println("after()......");
    }


}
