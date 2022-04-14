package ru.netology.sqr;

public class SQRService {
    public int calculateAmountSquare(int rangeLimit1, int rangelimit2) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= rangeLimit1 && sqr <= rangelimit2) {
                count++;
            }

        }
        return count;
    }

}