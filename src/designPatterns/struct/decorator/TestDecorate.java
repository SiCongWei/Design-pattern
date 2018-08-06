package designPatterns.struct.decorator;

public class TestDecorate {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decorate = new Decorate(source);
        decorate.method();
    }

}
