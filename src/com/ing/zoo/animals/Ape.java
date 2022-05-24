package com.ing.zoo.animals;

public class Ape extends Animal implements Herbivor{
    public Ape(String nameString, String helloTexString){
        super(nameString, helloTexString);
    }

    @Override
    public void eatLeaves() {
        eatText = "nom nom nom thx hooman";
        System.out.println(eatText);
    }
}
