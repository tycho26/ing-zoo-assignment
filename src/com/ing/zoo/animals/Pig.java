package com.ing.zoo.animals;

import java.util.Random;

public class Pig extends Animal implements Omnivor{
    public String trick;

    public Pig(String nameString ,String helloTexString)
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
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
