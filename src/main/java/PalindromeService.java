import java.util.logging.Logger;

public class PalindromeService {

    private static final Logger logger = Logger
            .getLogger(PalindromeService.class.getName());

    private String string;
    private static final String regex = "[^a-zA-Zа-яА-Я]";

    public PalindromeService(String string) {
        this.string = string;
    }

    public PalindromeService(){}

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private void toLowerCase() {
        setString(this.string.toLowerCase());
    }

    private void getCleanedText(){
        setString(this.string.replaceAll(regex,""));
    }

    private String getReversed(){
        return new StringBuilder(string).reverse().toString();
    }

    public boolean isValid(){
        toLowerCase();
        getCleanedText();
        logger.info("Method isValid has been called.\n" +
                "\tThe cleaned original word is: " + this.getString() +
                "\n\tThe cleaned reversed word is: " + this.getReversed() +
                "\n");
        return this.getString().equals(this.getReversed());
    }
}
