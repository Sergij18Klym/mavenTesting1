import java.util.logging.Logger;

public class BooleanOperations {

    private static final Logger logger = Logger.getLogger(BooleanOperations.class.getName());

    private Boolean firstOne;
    private Boolean secondOne;

    public BooleanOperations(Boolean firstOne, Boolean secondOne) {
        this.firstOne = firstOne;
        this.secondOne = secondOne;
    }

    public BooleanOperations(){}

    public boolean isFirstOne() {
        return firstOne;
    }

    public void setFirstOne(Boolean firstOne) {
        this.firstOne = firstOne;
    }

    public boolean isSecondOne() {
        return secondOne;
    }

    public void setSecondOne(Boolean secondOne) {
        this.secondOne = secondOne;
    }

    public Boolean conjunction(){
        logger.info("CONJUNCTION");
        if (firstOne == null || secondOne == null) return null;
        return this.firstOne && this.secondOne;
    }

    public Boolean disjunction(){
        logger.info("DISJUNCTION");
        if (this.firstOne == null) return this.secondOne;
        if (this.secondOne == null) return this.firstOne;
        return this.firstOne || this.secondOne;
    }
}