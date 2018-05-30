package com.company;

public class BubbleSort {

    public void bubbleSort(String salesman[], float nrOfSales[], float quota[]){
        float aux=0;
        String auxS;

        for (int i = 0; i < nrOfSales.length; i++) {
            for (int j = 1; j < (nrOfSales.length - i); j++) {

                if (quota[j - 1] < quota[j]) {
                    aux = quota[j - 1];
                    quota[j - 1] = quota[j];
                    quota[j] = aux;

                    auxS=salesman[j-1];
                    salesman[j-1]=salesman[j];
                    salesman[j]=auxS;
                }
            }

        }

    }
}
