package main.java.proxyexample;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("testImage.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
