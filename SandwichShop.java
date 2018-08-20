import java.util.Scanner;
import java.lang.System;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int veggie;
        int burgers;
        int sub;
        int soup;
        System.out.print("Checking Sales Goals!");
        System.out.print("The sales goal for veggie sandwiches is " + goalForVeggies);
        System.out.print("How many veggie sandwiches were sold today?");
        veggie = keyboard.nextInt();
        if (veggie > goalForVeggies){
            System.out.println("Made goal for veggie sandwiches!");}
            else
                System.out.println("Aw. That fell short!");
        keyboard.skip("\n");
        System.out.print("The sales goal for burgers is " + goalForBurgers);
        burgers = keyboard.nextInt();
        if (burgers > goalForBurgers){
            System.out.println("Made the goal for burgers!");}
        else
            System.out.println("That fell short!");
        keyboard.skip("\n");
        System.out.println("How many subs were sold today?");
        System.out.println("The sales goal for subs is " + goalForSubs);
        sub = keyboard.nextInt();
        if (sub > goalForSubs)
            System.out.println("Hooray! You met the goal!");
        else
            System.out.println("You did not meet the goal for subs.");
        keyboard.skip("\n");
        System.out.println("How many bowls of soup did you sell?");
        System.out.println("The soup goal for the day is " + goalForSoup);
        soup = keyboard.nextInt();
        if (soup > goalForSoup)
            System.out.println("You made your goal!");
        else
            System.out.println("You didn't meet your goal.");
        keyboard.skip("\n");
        }
    }
}

