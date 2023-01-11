package Inheritance.stackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;
    private int currentIndex;

    public StackOfStrings() {
        this.data = new ArrayList<>();
        this.currentIndex = -1;
    }

    public void push(String element) {
        this.currentIndex++;
        this.data.add(element);
    }

    public String pop() {
        return this.data.remove(this.currentIndex--);
    }

    public String peek() {
        return this.data.get(this.currentIndex);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
