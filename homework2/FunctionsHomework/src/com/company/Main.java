package com.company;

public class Main {

    public static void main(String[] args) {

        float nrOfSales[] = new float[]{20, 21, 20, 12, 18};
        float saleQuota[] = new float[]{3, 4, 2, 2, 1};
        String[] salesman = {"Alex", "Paul", "Gigi", "Doru", "Nistor"};
        float quota[]=new float[6];

        CalculQuota f=new CalculQuota();
        BubbleSort f2=new BubbleSort();

        f.calculQuota(salesman,quota,nrOfSales,saleQuota);
        f2.bubbleSort(salesman,nrOfSales,quota);

        for(int i=0;i<nrOfSales.length;i++)
            System.out.println(salesman[i] + " are o cota de " + quota[i]+".");

    }

}
