package designPatterns.builder.factoryMethod;


public class TestFactoryMethod {

    public static void main(String[] args) {

        Producer producer1 = new EmailSenderProducer();
        Sender sender1 = producer1.produce();
        sender1.send();

        Producer producer2 = new SmsSenderProducer();
        Sender sender2 = producer2.produce();
        sender2.send();
    }

}
