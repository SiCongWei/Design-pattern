package designPatterns.struct.Bridge;

public class TestBridge {

    public static void main(String[] args) {
        Bridge bridge = new Mybridge();
        bridge.setSourceable(new Source1());
        bridge.method();

        bridge.setSourceable(new Source2());
        bridge.method();
    }


}
