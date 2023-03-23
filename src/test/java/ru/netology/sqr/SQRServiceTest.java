package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/sqrservice.csv")
    public void testSQRService(int expected, int limitStart, int limitFinish) {
        SQRService service = new SQRService();

        int actual = service.calcAmountOfSQRT(limitStart, limitFinish);
        assertEquals(expected, actual);
    }
}
