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
    @Test
    void shouldCalculateAmountSquareNothing() {
        SQRService service = new SQRService();
        int rangeLimit1 = 5;
        int rangeLimit2 = 99;
        int expected = 0;

        int actual = service.calculateAmountSquare(5, 99);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateAmountSquareNothingMax() {
        SQRService service = new SQRService();
        int rangeLimit1 = 100;
        int rangeLimit2 = 9801;
        int expected = 90;

        int actual = service.calculateAmountSquare(100, 9900);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateAmountSquareNothingOne() {
        SQRService service = new SQRService();
        int rangeLimit1 = 5;
        int rangeLimit2 = 100;
        int expected = 1;

        int actual = service.calculateAmountSquare(5, 100);

        assertEquals(expected, actual);
    }


}