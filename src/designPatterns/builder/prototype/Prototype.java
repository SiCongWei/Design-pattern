package designPatterns.builder.prototype;

public class Prototype {

    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype pro = (Prototype) super.clone();
        return pro;
    }
}
