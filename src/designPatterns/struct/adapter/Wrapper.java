package designPatterns.struct.adapter;

/**
 * 对象的适配器模式
 */
public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(Source source){
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {

    }
}
