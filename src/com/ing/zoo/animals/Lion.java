package com.ing.zoo.animals;

public class Lion extends Animal implements Carnivor {

    public Lion(String nameString ,String helloTexString)
    {
        super(nameString, helloTexString);
    }

    @Override
    public void sayHello()
    {
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
