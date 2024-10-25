public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository names = new NameRepository();
        Iterator iterator = names.getIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}