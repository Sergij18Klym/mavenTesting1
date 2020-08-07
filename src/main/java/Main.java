public class Main {

    public static void main(String[] args) {

        String abba = "A'Bb a2 ";
        PalindromeService palEng = new PalindromeService(abba);
        System.out.println("Pal: " + palEng.isValid());

        String abbaRus = "\tАбБ а ";
        PalindromeService palRus = new PalindromeService(abbaRus);
        System.out.println("Pal rus: " + palRus.isValid());

        BooleanOperations boolOp = new BooleanOperations(null,null);
        System.out.println(boolOp.conjunction());
        System.out.println(boolOp.disjunction());
    }
}
