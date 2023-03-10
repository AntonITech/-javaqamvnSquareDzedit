package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void amountOfNumbersInRange() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQRT(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}