public class Main {
    public static void main(String[] args) {
        /** this is a programm suggesting a name for a group of thiefs
         * @author George Maysuradze
         * @version 1.0 **/
        System.out.print("Hello ");
        System.out.println("World!");

        System.out.println("Ideas for the name of our gang:");
        System.out.println("Byte Bandits\n" + // best one in my opinion
                "Array Bandits\n" +
                "CryptoKey Crooks\n" + // FIXME: remove this option
                "Boolean Burglars\n" +
                /* possibly
                all
                the
                options
                are
                bad */
                "Cunning Coders\n" +
                "Assembler Hustlers\n" +
                "Blockchain Brigade\n" +
                "Java Gents\n" +
                "La Kotlin Cartel");
        // TODO: choose only one name
        System.err.printf("Error");
    }
}