package com.ing.zoo.animals;

public abstract class Animal {

    public String name;
    public String helloText;
    public String eatText;

    Animal(String nameString ,String helloTexString)
    {
        name = nameString;
        helloText = helloTexString;
        
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }
}
