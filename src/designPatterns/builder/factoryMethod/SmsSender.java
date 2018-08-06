package designPatterns.builder.factoryMethod;

public class SmsSender implements Sender{

        @Override
        public void send() {
            System.out.println("smsSender............");
        }

}
