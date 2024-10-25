class ConcreteMediator implements Mediator {
    private Colleague colleague1, colleague2;
    public void setColleague1(Colleague colleague) { colleague1 = colleague; }
    public void sendMessage(String message, Colleague colleague) {
        if (colleague == colleague1) colleague2.receive(message);
        else colleague1.receive(message);
    }
}
abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) { this.mediator = mediator; }
    public abstract void send(String message);
}