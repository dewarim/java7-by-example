package de.dewarim.java7.coin;

/**
 * Strings are valid items in switch-statements now.
 */
public class StringInSwitchCase {

    public static String doSwitch(String threeLetterAgency){
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
