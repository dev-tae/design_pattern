package main.java.builderexample;

public class Main {

    public static void main(String[] args) {
        Pizza hawaiianPizza = new Pizza.Builder()
                .dough("cross")
                .sauce("mild")
                .topping("ham+pineapple")
                .build();

        Pizza cheesePizza = new Pizza.Builder()
                .dough("cross")
                .sauce("mild")
                .topping("Pepperoni+cheese")
                .cheeseCrust(true)
                .build();

        System.out.println(hawaiianPizza);
        System.out.println(cheesePizza);
    }
}
