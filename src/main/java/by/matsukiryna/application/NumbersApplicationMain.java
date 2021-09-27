package by.matsukiryna.application;

import by.matsukiryna.factory.CustNumber;
import by.matsukiryna.factory.DoubleCustNumber;
import by.matsukiryna.factory.IntCustNumber;
import by.matsukiryna.parse.Parser;

import by.matsukiryna.service.AddingOperationService;
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
        Path path = Paths.get("file.txt");
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

        AddingOperationService addOperation = new AddingOperationService();

        CustNumber result = new DoubleCustNumber(0);
        for(CustNumber it : numbersList) {
            result = addOperation.add(it, result);
        }
    }
}
