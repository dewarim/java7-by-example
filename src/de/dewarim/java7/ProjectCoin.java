package de.dewarim.java7;

import de.dewarim.java7.coin.ExceptionHandling;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

/*
 * Project Coin: "small change" or "small changes"
 */
public class ProjectCoin {

    public static void main(String[] args) {

        /*
         * Syntactic sugar
         */
        int twoFiveFive = 0b11111111;
        say("An easier way to specify binary values: " + twoFiveFive);
        int underscored255 = 0b1111_1111;
        say("You can now use underscores in numbers to make them easier to read: " + underscored255);

        say("Be careful, agents of the " + switchWithStrings("AZA") + " are listening");
        
        try {
            new ExceptionHandling().throwException();
        }
        catch ( Exception e){
            // ignore
        }
    }

    public static void say(Object o) {
        System.out.println(String.valueOf(o));
    }

    public static String switchWithStrings(String threeLetterAgency) {
        String tla;
        switch (threeLetterAgency) {
            case "BND":
                tla = "Bundesnachrichtendienst";
                break;
            case "NSA":
                tla = "National Security Agency";
                break;
            case "AZA":
                tla = "Ananas-Züchter-Alaskas";
                break;
            default:
                tla = "Men in Black";
        }
        return tla;
    }

    
}
