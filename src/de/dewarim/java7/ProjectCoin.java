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
        say("An easier way to specify binary values: " + twoFiveFive);
        int underscored255 = 0b1111_1111;
        say("You can now use underscores in numbers to make them easier to read: " + underscored255);

        say("Be careful, agents of the " + switchWithStrings("AZA") + " are listening");
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
