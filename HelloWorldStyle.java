package test;
/**
* Print statements with proper style check.
*
* @author  Mr. Riscalas
* @version 1.0
* @since   2023-02-08
*/

public final class HelloWorldStyle {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     *
     */
    public static void main(String[] args) {
        // Print What I want to do this year
        System.out.print("Next year I plan on going to university for ");
        System.out.println("Physics");
        System.out.print("I am super excited for it and looking forward ");
        System.out.println("to many years of learning");
    }
}
