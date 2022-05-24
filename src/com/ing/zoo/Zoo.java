package com.ing.zoo;

import java.util.ArrayList;
import java.util.Scanner;

import com.ing.zoo.animals.Hippo;
import com.ing.zoo.animals.Lion;
import com.ing.zoo.animals.Omnivor;
import com.ing.zoo.animals.Pig;
import com.ing.zoo.animals.Tiger;
import com.ing.zoo.animals.Zebra;
import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.Carnivor;
import com.ing.zoo.animals.Herbivor;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion(
            "henk", "roooaoaaaaar"
        );
        Hippo elsa = new Hippo(
            "elsa", "splash"
        );
        Pig dora = new Pig(
            "dora", "splash"
        );
        Tiger wally = new Tiger(
            "wally",
            "rraaarww"
        );
        Zebra marty = new Zebra(
            "marty",
            "zebra zebra"
        );
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0]))
        {
            for (int i = 0; i < animals.size(); i++) {
  
                animals.get(i).sayHello();
            }
        }
        else if(input.equals(commands[0] + " henk"))
        {
            henk.sayHello();
        }
        else if(input.equals(commands[0] + " elsa"))
        {
            elsa.sayHello();
        }
        else if(input.equals(commands[0] + " dora"))
        {
            dora.sayHello();
        }
        else if(input.equals(commands[0] + " wally"))
        {
            wally.sayHello();
        }
        else if(input.equals(commands[0] + " marty1"))
        {
            marty.sayHello();
        }
        // give leaves
        else if(input.equals(commands[1])){
            for (int i = 0; i < animals.size(); i++) {
                if(Herbivor.class.isAssignableFrom(animals.get(i).getClass()) || Omnivor.class.isAssignableFrom(animals.get(i).getClass())){
                    try {
                        animals.get(i).getClass().getDeclaredMethod("eatLeaves").invoke(animals.get(i));
                        
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        }
        else if(input.equals(commands[2])){
            for (int i = 0; i < animals.size(); i++) {
                if(Carnivor.class.isAssignableFrom(animals.get(i).getClass()) || Omnivor.class.isAssignableFrom(animals.get(i).getClass())){
                    try {
                        animals.get(i).getClass().getDeclaredMethod("eatMeat").invoke(animals.get(i));
                        
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
