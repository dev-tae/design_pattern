package main.java.prototypeexample;

public class Main {
    public static void main(String[] args) {
        Tree oak = new OakTree();
        Tree anotherOak = oak.clone();

        Tree pine = new PineTree();
        Tree anotherPine = pine.clone();
    }
}
