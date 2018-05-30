package com.company;

public class CalculQuota {

    public void calculQuota(String salesman[], float quota[], float nrOfSales[], float saleQuota[])
    {
        int k=0;
        for(int i=0;i<nrOfSales.length;i++)
            quota[k++]=nrOfSales[i]*saleQuota[i];
    }
}
