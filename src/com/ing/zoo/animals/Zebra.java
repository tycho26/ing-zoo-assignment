package com.ing.zoo.animals;

import java.util.Random;

public class Zebra extends Animal implements Herbivor {
    public String trick;

    public Zebra(String nameString ,String helloTexString)
    {
        super(nameString, helloTexString);
    }

    @Override
    public void sayHello()
    {
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
