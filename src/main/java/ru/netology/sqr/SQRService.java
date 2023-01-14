package ru.netology.sqr;

public class SQRService {

    public int calcSQRT(int lowValue, int uppValue) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= lowValue && iSquare <= uppValue) {
                counter++;
            }
        }
        return counter;
    }
}
