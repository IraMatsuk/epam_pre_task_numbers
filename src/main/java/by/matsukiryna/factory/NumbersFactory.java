package by.matsukiryna.factory;

import by.matsukiryna.validation.Validator;

public class NumbersFactory {
    public static CustNumber createNumber(String numberStr) {
        Validator validator = new Validator();
        if (validator.isInt(numberStr)) {
            return new IntCustNumber(Integer.parseInt(numberStr));
        } else if (validator.isDouble(numberStr)){
            return new DoubleCustNumber(Double.parseDouble(numberStr));
        } else {
            throw new IllegalArgumentException("Unknown data format");
        }
    }
}
