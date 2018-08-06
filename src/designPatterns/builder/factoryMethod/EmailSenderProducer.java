package designPatterns.builder.factoryMethod;

public class EmailSenderProducer implements Producer {

    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
