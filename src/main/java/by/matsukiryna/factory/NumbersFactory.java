package by.matsukiryna.factory;

import by.matsukiryna.validation.Validator;

public class NumbersFactory {
    public static CustNumber createNumber(String numberStr) {
        Validator validator = new Validator();
        if(!validator.numberValidate(numberStr)){
            throw new IllegalArgumentException("Unknown number format");
        }

        double doubleNumber = Double.parseDouble(numberStr);
        if (doubleNumber % 1 != 0) {
            return new DoubleCustNumber(doubleNumber);
        } else {
            int intNumber = Integer.parseInt(numberStr);
            return new IntCustNumber(intNumber);
        }
    }
}
