public class WorkWithStrings {

    public static void main(String[] args) {

        String helloWorld = "   Hello world!";
        int length = helloWorld.length();

        String uppercase = helloWorld.toUpperCase();
        String lowercase = helloWorld.toLowerCase();

        System.out.println(helloWorld + "\n" + "The string has a length of " + length + " Characters");
        System.out.println("\n" + uppercase);
        System.out.println("\n" + lowercase);


        helloWorld = helloWorld.replace("world", "Codersbay");

        System.out.println("\n" + helloWorld);


        String trimmedHelloWorld = helloWorld.trim();

        System.out.println("\n" + trimmedHelloWorld);


        String helloRepeat = "Hello Codersbay! \n";
        String repeated = helloRepeat.repeat(15);

        System.out.println("\n" + repeated);

    }
}
