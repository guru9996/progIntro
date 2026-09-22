public class HelloWorld4 {
    public static String greater(String name) {
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
    public static void main(String[] args) {
/*
        for (int i = 0; i < args.length; i++ ) {
            System.out.println("Hello, " + args[i] + "!");
        }
*/
/*
        for (String arg : args) {
            System.out.println("Hello, " + arg + "!");
        }
*/
        int i = 0;
        while (i < args.length) {
            System.out.println("Hello, " + greater(args[i++]) + "!");
        }
    }
}