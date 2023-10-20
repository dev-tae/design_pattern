package main.java.mediatorexample;

public class ConcreteUser implements User {
    private String name;
    private ChatMediator mediator;

    public ConcreteUser(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.mediator.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " Sending Message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " Received Message: " + message);
    }
}
