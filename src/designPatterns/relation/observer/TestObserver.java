package designPatterns.relation.observer;

public class TestObserver {

    public static void main(String[] args) {

        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();

        Subject mySubject = new MySubject();
        mySubject.add(observer1);
        mySubject.add(observer2);


        mySubject.operation();

    }


}
