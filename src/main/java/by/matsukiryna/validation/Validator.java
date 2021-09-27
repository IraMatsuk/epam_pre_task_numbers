package by.matsukiryna.validation;

public class Validator {
    private String intRegexPattern = "[+-]?[0-9]+";
    private String floatingPointRegexPattern = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";

    public boolean numberValidate(String numberStr) {
        return (numberStr.matches(intRegexPattern)) || (numberStr.matches(floatingPointRegexPattern));
    }

  /*  public boolean validateInt(String intStr) {
        if (!intStr.matches(intRegexPattern)) {
            lastError = "Invalid data";
            return false;
        }
        return true;
    }

    public boolean validateDouble(String doubleStr) {
        if (!doubleStr.matches(floatingPointRegexPattern)) {
            lastError = "Invalid data";
            return false;
        }
        return true;
    }

    public String getLastError() {
        return this.lastError;
    }*/
}
