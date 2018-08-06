package designPatterns.builder.factoryMethod;

public class SmsSenderProducer implements  Producer{

        @Override
        public Sender produce() {
            return new SmsSender();
        }
}
