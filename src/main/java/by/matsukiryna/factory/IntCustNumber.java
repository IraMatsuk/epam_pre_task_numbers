package by.matsukiryna.factory;

public class IntCustNumber implements CustNumber {
    private int number;

    public IntCustNumber(int intNumber) {
        this.number = intNumber;
    }

    public IntCustNumber(IntCustNumber intNumber) {
        this(intNumber.number);
    }

    public double getNumber() {
        return number;
    }

    @Override
    public void add(CustNumber custNumber) {
        IntCustNumber intCustNumber = (IntCustNumber) custNumber;
        number += intCustNumber.getNumber();
    }

    @Override
    public void subtr(CustNumber custNumber) {
        IntCustNumber intCustNumber = (IntCustNumber) custNumber;
        number -= intCustNumber.getNumber();
    }

    @Override
    public void mult(CustNumber custNumber) {
        IntCustNumber intCustNumber = (IntCustNumber) custNumber;
        number *= intCustNumber.getNumber();
    }

    @Override
    public void div(CustNumber custNumber) {
        IntCustNumber intCustNumber = (IntCustNumber) custNumber;
        number /= intCustNumber.getNumber();
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
