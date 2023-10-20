package main.java.mediatorexample;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteChatMediator();

        User user1 = new ConcreteUser(mediator, "Tae");
        User user2 = new ConcreteUser(mediator, "Seohui");
        User user3 = new ConcreteUser(mediator, "Mint");


        user1.send("Hi, How are you?");
        user2.send("I'm good. How about you?");
    }
}
