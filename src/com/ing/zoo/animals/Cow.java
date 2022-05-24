package com.ing.zoo.animals;

public class Cow extends Animal implements Herbivor {
    
    public Cow(String nameString, String helloTexString){
        super(nameString, helloTexString);
    }

    public void eatLeaves(){
        eatText = "njooom... njooom... njooom... Moo!";
        System.out.println(eatText);
    }

}
