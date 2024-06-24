package org.example;
import java.util.List;
public class Human {

    private List<Parrot> parrots;
    private Cat cat;
    private Dog dog;
    public Human(List<Parrot> parrots, Cat cat, Dog dog) {
        this.parrots = parrots;
        this.cat = cat;
        this.dog = dog;
        System.out.println("I have cat "+cat+"\nI have dog "+dog+"\nI have parrots "+parrots+"\n(#1 "+ parrots.get(0) +") and (#2 "+parrots.get(1)+")");
    }

}