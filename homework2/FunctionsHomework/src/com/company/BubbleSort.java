package com.company;

public class BubbleSort {

    public void BubbleSort(String Salesman[], float NrOfSales[], float Quota[]){
        float aux=0;
        String auxS;

        for (int i = 0; i < NrOfSales.length; i++) {
            for (int j = 1; j < (NrOfSales.length - i); j++) {

                if (Quota[j - 1] < Quota[j]) {
                    aux = Quota[j - 1];
                    Quota[j - 1] = Quota[j];
                    Quota[j] = aux;

                    auxS=Salesman[j-1];
                    Salesman[j-1]=Salesman[j];
                    Salesman[j]=auxS;
                }
            }

        }

    }
}
