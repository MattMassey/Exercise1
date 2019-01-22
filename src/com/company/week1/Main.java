package com.company.week1;

public class Main {

    public static void main(String[] args) {
        String city = "Columbus";
        int zip = 43215;
        int dailyHighs[] = {32, 25, 27, 40, 45};
        float avgHigh = 0;
        for (int i = 0; i<=4; i++) {
            avgHigh += dailyHighs[i];
        }
        avgHigh /= 5;

        System.out.println("City: " + city +"\nZip code: " + zip +"\nAverage High: " + avgHigh);
    }
}
