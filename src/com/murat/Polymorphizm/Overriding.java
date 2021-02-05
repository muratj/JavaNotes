package com.murat.Polymorphizm;

public class Overriding {
    public static void main(String[] args) {
        Animal gorilla = new Monkey();
        gorilla.eats();
    }
}


class Animal {
    public void eats() {
        System.out.println("Grass");
    }
}
class Monkey extends Animal {
    public void eats() {
        System.out.println("Bananas");
    }
}
