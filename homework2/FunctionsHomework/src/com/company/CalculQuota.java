package com.company;

public class CalculQuota {

    public void CalculQuota(String Salesman[], float Quota[], float NrOfSales[], float SaleQuota[])
    {
        int k=0;
        for(int i=0;i<NrOfSales.length;i++)
            Quota[k++]=NrOfSales[i]*SaleQuota[i];
    }
}
