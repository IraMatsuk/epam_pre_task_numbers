package by.matsukiryna.factory;

public class DoubleCustNumber implements CustNumber {
    private double number;

    public DoubleCustNumber(double doubleNumber) {
        this.number = doubleNumber;
    }

    public DoubleCustNumber(DoubleCustNumber doubleNumber) {
        this(doubleNumber.number);
    }

    public double getNumber() {
        return number;
    }

    @Override
    public void add(CustNumber custNumber) {
        DoubleCustNumber doubleCustNumber = (DoubleCustNumber) custNumber;
        number += doubleCustNumber.getNumber();
    }

    @Override
    public void subtr(CustNumber custNumber) {
        DoubleCustNumber doubleCustNumber = (DoubleCustNumber) custNumber;
        number -= doubleCustNumber.getNumber();
    }

    @Override
    public void mult(CustNumber custNumber) {
        DoubleCustNumber doubleCustNumber = (DoubleCustNumber) custNumber;
        number *= doubleCustNumber.getNumber();
    }

    @Override
    public void div(CustNumber custNumber) {
        DoubleCustNumber doubleCustNumber = (DoubleCustNumber) custNumber;
        double result = number / doubleCustNumber.getNumber();
        if ((result == Double.POSITIVE_INFINITY)
                || (result == Double.NEGATIVE_INFINITY)) {
            throw new ArithmeticException("division by zero");
        }
        number = result;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
