package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfig {

    @Bean
    public Parrot parrot1() {
        return new Parrot();
    }

    @Bean
    public Parrot parrot2() {
        return new Parrot();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Human human() {
        List<Parrot> parrots = new ArrayList<>();
        parrots.add(parrot1());
        parrots.add(parrot2());
        return new Human(parrots, cat(), dog());
    }
}