package com.ing.zoo.animals;

import java.util.Random;

public class Tiger extends Animal implements Carnivor{
    public String trick;

    public Tiger(String nameString ,String helloTexString)
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
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
