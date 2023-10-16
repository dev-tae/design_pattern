package main.java.prototypeexample;

public class PineTree extends Tree {
    public Tree clone() {
        return new PineTree();
    }
}
