package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldCalculateAmountSquare() {
        SQRService service = new SQRService();
        int rangeLimit1 = 200;
        int rangeLimit2 = 300;
        int expected = 3;

        int actual = service.calculateAmountSquare(200, 300);

        assertEquals(expected, actual);
    }
}