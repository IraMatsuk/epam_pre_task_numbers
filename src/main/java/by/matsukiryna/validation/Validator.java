package by.matsukiryna.validation;

public class Validator {
    private String intRegexPattern = "[+-]?[0-9]+";
    private String floatingPointRegexPattern = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";

    public boolean isInt(String numberStr){
        return numberStr.matches(intRegexPattern);
    }

    public boolean isDouble(String numberStr){
        return numberStr.matches(floatingPointRegexPattern);
    }
}
