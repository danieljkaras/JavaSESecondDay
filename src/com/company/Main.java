package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        CheckingClass somethingNew = new CheckingClass(8, false);
        FibonnaciSeries myFiboSeries = new FibonnaciSeries();

        EqualsExample myEqual = new EqualsExample();

        myEqual.setTextA("joanna");
        myEqual.setTextB("joanna");
        System.out.println(myEqual.getTextA().hashCode());
        System.out.println(myEqual.getTextB().hashCode());




        //myFiboSeries.fiboSeries(20);
        //myFiboSeries.fiboSeriesArray(15);
        myEqual.stringCompare();

    }
}
