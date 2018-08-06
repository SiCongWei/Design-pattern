package designPatterns.builder.factoryMethod;

public class EmailSender implements Sender {

        @Override
        public void send() {
            System.out.println("emailSender..........");
        }

}
