package designPatterns.struct.Bridge;

public class Mybridge extends Bridge{

    public void method(){
        getSourceable().method();
    }

}
