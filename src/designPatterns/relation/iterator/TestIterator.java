package designPatterns.relation.iterator;

public class TestIterator {

    public static void main(String[] args) {

        Collection collection = new MyCollection();
        Iterator iterator = new MyIterator(collection);

        while (iterator.hasNext())
            System.out.print(iterator.next()+", ");

    }

}
