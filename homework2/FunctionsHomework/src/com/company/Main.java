package com.company;

public class Main {

    public static void main(String[] args) {

        float NrOfSales[] = new float[]{20, 21, 20, 12, 18};
        float SaleQuota[] = new float[]{3, 4, 2, 2, 1};
        String[] Salesman = {"Alex", "Paul", "Gigi", "Doru", "Nistor"};
        float Quota[]=new float[6];

        CalculQuota f=new CalculQuota();
        BubbleSort f2=new BubbleSort();

        f.CalculQuota(Salesman,Quota,NrOfSales,SaleQuota);
        f2.BubbleSort(Salesman,NrOfSales,Quota);

        for(int i=0;i<NrOfSales.length;i++)
            System.out.println(Salesman[i] + " are o cota de " + Quota[i]+".");

    }

}
