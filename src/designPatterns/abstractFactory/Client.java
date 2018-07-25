package designPatterns.abstractFactory;

public class Client {

    public static void main(String[] args) {

        //进入高级包子店来个高级包子
        BreakfastFactory factory = new AdvBreakFastFactory();
        BreakFast breakFast = factory.sellBuns();
        breakFast.sell();

        //下面进入低级包子店来个低级豆浆喝一喝
        BreakfastFactory factory1 = new LowBreakFastFactory();
        BreakFast breakFast1 = factory1.sellSoyMilk();
        breakFast1.sell();

    }

}
