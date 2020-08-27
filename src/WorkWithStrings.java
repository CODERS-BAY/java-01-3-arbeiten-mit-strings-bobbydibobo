public class WorkWithStrings {

    public static void main(String[] args) {

        String helloWorld = "   Hello world!";
        int length = helloWorld.length();

        String uppercase = helloWorld.toUpperCase();
        String lowercase = helloWorld.toLowerCase();

        System.out.printf("%s %n The string has a length of %d Characters", helloWorld, length);
        System.out.printf("%n %s", uppercase);
        System.out.printf("%n %s %n", lowercase);




        helloWorld = helloWorld.replace("world", "Codersbay");

        System.out.printf("%n %s %n", helloWorld);


        String trimmedHelloWorld = helloWorld.trim();

        System.out.printf("%n %s", trimmedHelloWorld);


        String helloRepeat = "Hello Codersbay! \n";
        String repeated = helloRepeat.repeat(15);

        System.out.printf("%n %s", repeated);

    }
}
