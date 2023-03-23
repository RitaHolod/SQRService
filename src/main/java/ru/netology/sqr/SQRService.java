package ru.netology.sqr;

public class SQRService {
    public int calcAmountOfSQRT(int limitStart, int limitFinish) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i*i;
            if (sqr >= limitStart && sqr <= limitFinish) {
                count++;
                System.out.println(sqr);
            }
        }
        return count;
    }
}
