package de.dewarim.java7.coin;

/**
 * Catch multiple exceptions with a single catch clause and rethrow properly.
 *
 * @see {http://docs.oracle.com/javase/7/docs/technotes/guides/language/catch-multiple.html}
 */
public class ExceptionHandling {

    public void throwException() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            Class c = Class.forName("java.lang.Long");
            Object o = c.newInstance();
        } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
            say("We can now catch multiple exceptions.");
            say("Note: e is implicitly final in multi-catch clauses.");
            throw e;
        }

        try {
            Class c = Class.forName("java.lang.String");
            Object o = c.newInstance();
        } catch (final Exception e) {
            say("We catch an Exception and declare to throw the exact types of the possible exceptions in the method signature.");
            say("Note: If you do not declare 'e' to be final and assign another exception to it, the signature must throw 'Exception'.");
            throw e;
        }
    }

    public static void say(Object o) {
        System.out.println(String.valueOf(o));
    }

}
