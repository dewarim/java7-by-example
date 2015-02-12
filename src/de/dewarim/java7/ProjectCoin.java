package de.dewarim.java7;

/*
 * Project Coin: "small change" or "small changes"
 */
public class ProjectCoin {

    public static void main(String[] args) {

        /*
         * Syntactic sugar
         */
        int twoFiveFive = 0b11111111;
        say("An easier way to specify binary values: "+twoFiveFive);
        int underscored255 = 0b1111_1111;
        say("You can now use underscores in numbers to make them easier to read: "+underscored255);
    }

    public static void say(Object o){
        System.out.println(String.valueOf(o));
    }
}
