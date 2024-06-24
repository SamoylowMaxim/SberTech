package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Human {

    private List<Parrot> parrots;
    private Cat cat;
    private Dog dog;
    @Autowired
    public Human(@Qualifier("parrot") Parrot parrot1, @Qualifier("parrot") Parrot parrot2, Cat cat, Dog dog) {
        this.parrots = List.of(parrot1,parrot2);
        this.cat = cat;
        this.dog = dog;
        System.out.println("I have cat "+cat+"\nI have dog "+dog+"\nI have parrots "+parrots+"\n(#1 "+ parrots.get(0) +") and (#2 "+parrots.get(1)+")");
    }

}