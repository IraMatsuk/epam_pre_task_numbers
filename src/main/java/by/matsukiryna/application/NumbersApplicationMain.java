package by.matsukiryna.application;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.DoubleCustNumber;
import by.matsukiryna.factory.NumbersFactory;
import by.matsukiryna.parse.Parser;

import by.matsukiryna.service.AddingOperationService;
import by.matsukiryna.service.DivisionOperationService;
import by.matsukiryna.service.MultiplicationOperationService;
import by.matsukiryna.service.SubtractionOperationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersApplicationMain {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws FileNotFoundException {
        final String FILE_PATH = "file.txt";
        Path path = Paths.get(FILE_PATH);
        String numberStr = "";
        try (Stream<String> streamLines = Files.lines(path)) {
            numberStr = streamLines.collect(Collectors.joining());
            logger.info(numberStr);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e);
        }
        Parser parser = new Parser();
        List<CustNumber> numbersList = parser.parseNumberStr(numberStr);

        // addition operation
        AddingOperationService addOperation = new AddingOperationService();
        CustNumber result = numbersList.get(0);
        for( int i = 1; i < numbersList.size(); ++i){
            result = addOperation.add(result, numbersList.get(i));
        }
        logger.info("add " + result);

        // subtraction operation
        SubtractionOperationService subtOperation = new SubtractionOperationService();
        CustNumber result2 = numbersList.get(0);
        for( int i = 1; i < numbersList.size(); ++i){
            result2 = subtOperation.subtract(result2, numbersList.get(i));
        }
        logger.info("subtract " + result2);

        // multiple operation
        MultiplicationOperationService multOperation = new MultiplicationOperationService();
        CustNumber result3 = numbersList.get(0);
        for( int i = 1; i < numbersList.size(); ++i){
            result3 = multOperation.mult(result3, numbersList.get(i));
        }
        logger.info("multiply " + result3);

        // division operation
        try {
            DivisionOperationService divOperation = new DivisionOperationService();
            CustNumber result4 = numbersList.get(0);
            for( int i = 1; i < numbersList.size(); ++i){
                result4 = divOperation.divide(result4, numbersList.get(i));
            }
            logger.info("divide " + result4);
        } catch (ArithmeticException e) {
            logger.error(e);
        }
    }
}
