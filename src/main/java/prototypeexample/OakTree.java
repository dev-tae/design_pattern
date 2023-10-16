package main.java.prototypeexample;

public class OakTree extends Tree {
    public Tree clone() {
        return new OakTree();
    }
}
