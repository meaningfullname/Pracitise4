public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State1");
        Memento savedState = originator.saveStateToMemento();
    }
}