package com.ing.zoo.animals;

public class Hippo extends Animal implements Herbivor{

    public Hippo(String nameString ,String helloTexString)
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
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
