package by.matsukiryna.parse;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.NumbersFactory;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public List<CustNumber> parseNumberStr(String numberStr) {
        String[] splitResult = numberStr.split(" ");
        List<CustNumber> custNumberList = new ArrayList<CustNumber>();

        for (int i = 0; i < splitResult.length; i++) {
            custNumberList.add(NumbersFactory.createNumber(splitResult[i]));
        }
        return custNumberList;
    }
}
