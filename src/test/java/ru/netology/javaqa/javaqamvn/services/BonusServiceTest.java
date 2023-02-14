package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/data.csv")
    public void shouldCalculateForRegisteredAndUnderLimit(long expected, int amount, boolean registered) {
        BonusService service = new BonusService();


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}